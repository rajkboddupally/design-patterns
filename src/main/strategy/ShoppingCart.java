package src.main.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private Item item;
    private List<Item> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void removeItem(Item item) {
        cart.remove(item);
    }

    private int total() {
        int sum = 0;
        for (Item item : cart) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy strategy){
        strategy.pay(total());
    }

}

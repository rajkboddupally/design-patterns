package src.main.strategy;

public class ShoppingCartClient {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item(12L, "123123"));
        shoppingCart.addItem(new Item(10L, "123124"));
        shoppingCart.addItem(new Item(20L, "123125"));

        PaymentStrategy creditCardStrategy = new CreditCardStrategy("!2312312312312","1223", "343");
        shoppingCart.pay(creditCardStrategy);

        PaymentStrategy paypalStrategy = new PaypalStrategy("123456");
        shoppingCart.pay(paypalStrategy);


    }
}

package src.main.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy{
    private String cardNumber;
    private String expiry;
    private String cvv;

    @Override
    public void pay(int amount) {
        System.out.println("Payment made using CC - "+amount);
    }
}

package src.main.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PaypalStrategy implements PaymentStrategy{
    private String payPalId;
    @Override
    public void pay(int amount) {
        System.out.println("Payment made using Paypal - "+amount);
    }
}

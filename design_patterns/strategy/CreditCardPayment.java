package design_patterns.strategy;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amt) {
        System.out.println("Paid: "+amt+" using credit card");
    }
}

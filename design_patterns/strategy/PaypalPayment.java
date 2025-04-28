package design_patterns.strategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void pay(int amt) {
        System.out.println("Paid : "+amt+" using PayPal");
    }
}

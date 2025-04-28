package design_patterns.adapter.payment;

public class PaymentAdapter implements OldPaymentProcessor {
    private NewPaymentProcessor newPaymentProcessor=new NewPaymentProcessor();
    @Override
    public void processPayment(double amt) {
        newPaymentProcessor.executePaymentProcessor(amt);
    }
}

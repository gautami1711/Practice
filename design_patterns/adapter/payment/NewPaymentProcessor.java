package design_patterns.adapter.payment;

public class NewPaymentProcessor {
    public void executePaymentProcessor(double amt){
        System.out.println("Processing payment of: "+amt);
    }
}

package design_patterns.creational.adapter;

public class Payment {
    public static void main(String[] args) {
        CheckoutService service=new CheckoutService(new UpiPaymentAdapter());
        service.checkout(1,100);
    }
}

interface PaymentGateway{
    void pay(int amt, int orderId);
}

class RazorpayPayment implements PaymentGateway{
    @Override
    public void pay(int amt, int orderId) {
        System.out.println("payment done via Razorpay");
    }
}

//we need this to adapt with our flow , so we make minimal changes to how the client makes call for payment
class Upi{
    void makePayment(int amt, int orderId){
        System.out.println("Payment done via UPI");
    }
}

class UpiPaymentAdapter implements PaymentGateway{
    Upi upi;

    public UpiPaymentAdapter() {
    }

    @Override
    public void pay(int amt, int orderId) {
        upi.makePayment(amt,orderId);
    }
}


class CheckoutService{
    private PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(int orderId, double amt){
        paymentGateway.pay(100,1);
    }
}

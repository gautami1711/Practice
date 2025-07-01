package design_patterns.creational.abstract_factory;

public class Payment {

  public static void main(String[] args) {

  }

}

interface PaymentGateway{
  void ProcessPayment(double amt);
}

class RazorpayGateway implements PaymentGateway{

  @Override
  public void ProcessPayment(double amt) {
    System.out.println("Processed via Razorpay");
  }
}

class StripeGateway implements PaymentGateway{

  @Override
  public void ProcessPayment(double amt) {
    System.out.println("Processed via Stripe");
  }
}

interface Invoice{
  void generateInvoice(double amt);
}

class GstInvoice implements Invoice{

  @Override
  public void generateInvoice(double amt) {
    System.out.println("gst invoice generated");
  }
}

class UsInvoice implements Invoice{

  @Override
  public void generateInvoice(double amt) {
    System.out.println("USA invoice generated");
  }
}

interface RegionFactory{
  PaymentGateway createPg(String type);
  Invoice createInvoice();
}

class IndiaFactory implements RegionFactory{

  @Override
  public PaymentGateway createPg(String type) {
    if(type.equalsIgnoreCase("razorpay"))return  new RazorpayGateway();
    else if(type.equalsIgnoreCase("Stripe")) return  new StripeGateway();
    else return (PaymentGateway) new IllegalArgumentException("Not a valid gateway");
  }

  @Override
  public Invoice createInvoice() {
    return new GstInvoice();
  }
}

//similarly we can have for UsFactory as well


class CheckoutService{
  private String gatewayType;
  private PaymentGateway pg;
  private Invoice invoice;


  public CheckoutService(RegionFactory factory,String  gatewayType) {
    this.gatewayType = gatewayType;
    this.pg = factory.createPg(gatewayType);
    this.invoice = factory.createInvoice();
  }

  public void completeOrder(double amt){
    pg.ProcessPayment(amt);
    invoice.generateInvoice(amt);
  }
}





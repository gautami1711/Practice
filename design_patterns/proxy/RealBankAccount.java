package design_patterns.proxy;

public class RealBankAccount implements BankAccount{
    @Override
    public void accessAccount() {
        System.out.println("Accessing the real bank account");
    }
}

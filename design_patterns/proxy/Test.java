package design_patterns.proxy;

import design_patterns.proxy.image.Image;
import design_patterns.proxy.image.ProxyImage;

public class Test {
    public static void main(String[] args) {
        Image image=new ProxyImage("proto.jpg");
        image.display();
        image.display();

        //accessing account example
        BankAccount bankAccount=new ProxyBankAccount("User");
        bankAccount.accessAccount();

        BankAccount adminAccount = new ProxyBankAccount("Admin");
        adminAccount.accessAccount();
    }
}

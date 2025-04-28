package design_patterns.proxy;

public class ProxyBankAccount implements BankAccount{
   private RealBankAccount realBankAccount;
   private String userRole;

    public ProxyBankAccount(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void accessAccount() {
        if("admin".equalsIgnoreCase(userRole)){
            if(realBankAccount==null){
                realBankAccount=new RealBankAccount();
            }
            realBankAccount.accessAccount();
        }else {
            System.out.println("Access denied: Insufficient permissions");
        }
    }
}

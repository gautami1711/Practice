package design_patterns.dependency_injection;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to "+recipient+"  with message: "+message );
    }
}

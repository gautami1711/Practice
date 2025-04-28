package design_patterns.dependency_injection;

public class Test {
    public static void main(String[] args) {
        MessageService emailService= new EmailService();
        MessageProcessor processor=new MessageProcessor(emailService);
        processor.processMessage("Hello","gautami@gmail.com");
    }
}

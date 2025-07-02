package design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Email {
    public static void main(String[] args) {
        EmailTemplate welcomeCard1=EmailTemplateRegistry.getTemplate("Welcome");
        welcomeCard1.setContent("Hi Gautami, welcome to this site. all the best");
        welcomeCard1.send("gautami1705@gmai.com");


    }
}

interface EmailTemplate{
     EmailTemplate clone();
     void setContent(String content);
     void send(String to);
}

class WelcomeEmail implements EmailTemplate{
    private String content;
    private String subject;

    public WelcomeEmail(String content, String subject) {
        this.content = content;
        this.subject = subject;
    }

    public WelcomeEmail() {
        this.content = "Welcome to this site.Wish you a very good luck";
        this.subject = "Welcome email";
    }

    @Override
    public EmailTemplate clone() {
        try {
           return (WelcomeEmail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setContent(String content) {
        this.content=content;
    }

    @Override
    public void send(String to) {
        System.out.println("send email to: "+to+ "Subject: "+this.subject+" and message: "+ content);
    }
}


class EmailTemplateRegistry{
    private static final Map<String,EmailTemplate> templates=new HashMap<>();

    static {
        templates.put("Welcome",new WelcomeEmail());
    }

    public static EmailTemplate getTemplate(String type){
        return  templates.get(type).clone();
    }
}

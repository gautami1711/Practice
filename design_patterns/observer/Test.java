package design_patterns.observer;

public class Test {
    public static void main(String[] args) {
        NewsLetter newsLetter= new NewsLetter();
        Observer o1=new EmailSubscriber("User1");
        Observer o2= new EmailSubscriber("User2");

        newsLetter.subscribe(o1);
        newsLetter.subscribe(o2);

        newsLetter.setMessage("New edition available");

    }
}

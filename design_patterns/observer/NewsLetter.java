package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject{
    List<Observer> subscribers= new ArrayList<>();
    private String msg;

    public void setMessage(String msg) {
        this.msg = msg;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:subscribers){
            o.update(msg);
        }
    }
}

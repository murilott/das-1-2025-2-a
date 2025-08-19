package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subscriber {
    // private Subscriber[] subscribers = new Subscriber[5];
    private List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
    }
    
    public void unsubscribe(Subscriber s) {
        this.subscribers.remove(s);
    }

    public void notifySubscrbers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void mainBusinessLogic() {
        notifySubscrbers();
    }

    @Override
    public void update(Publisher context) {
        // TODO Auto-generated method stub
        
    }

    
}

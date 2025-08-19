package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subscriber {
    private Subscriber[] subscribers;
    private String mainState;

    public void subscribe(Subscriber s) {
        this.subscribers.
    }

    public void unsubscribe(Subscriber s) {

    }

    public void notifySubscrbers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this);
        }
    }

    public void mainBusinessLogic() {

    }

    @Override
    public void update(String context) {
        // TODO Auto-generated method stub
        
    }

    
}

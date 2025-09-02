package br.univille.observer;

import java.util.ArrayList;

public class Publisher implements Subscriber {
    // Lista estática - Código do diagrama
    // private Subscriber[] subscribers = new Subscriber[10];

    // Lista dinâmica
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    private String mainState;

    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
    }
    
    public void unsubscribe(Subscriber s) {
        this.subscribers.remove(s);
    }

    public void notifySubscrbers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void mainBusinessLogic() {
        notifySubscrbers();
    }

    @Override
    public void update(String context) {
        // TODO Auto-generated method stub
        
    }

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }
    
    
}

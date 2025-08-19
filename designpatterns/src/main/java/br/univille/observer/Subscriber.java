package br.univille.observer;

public interface Subscriber {
    public void update(Publisher context);
}

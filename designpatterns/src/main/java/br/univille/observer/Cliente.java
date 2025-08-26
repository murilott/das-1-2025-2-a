package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        var grupoFamilia = new Publisher();

        var pessoa1 = new ConcreteSubscribers();
        var pessoa2 = new ConcreteSubscribers();
        var pessoa3 = new ConcreteSubscribers();

        grupoFamilia.subscribe(pessoa1);
        grupoFamilia.subscribe(pessoa2);
        grupoFamilia.subscribe(pessoa3);

        grupoFamilia.setMainState("Bom dia");
        grupoFamilia.notifySubscrbers();
    }
}

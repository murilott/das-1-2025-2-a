package br.univille.singleton;

public class Singleton {
    // atributo estático cria um endereço único, como uma variável global. ele é caregado antes de tudo
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}

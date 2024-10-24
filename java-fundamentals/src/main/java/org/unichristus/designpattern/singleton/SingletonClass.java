package org.unichristus.designpattern.singleton;

public class SingletonClass {
    private static SingletonClass instance;
    private SingletonClass() {}

    public static synchronized SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        if (s1 == s2) {
            System.out.println("Singleton esta funcionando");
        } else {
            System.out.println("Singleton falhou!");
        }
    }
}

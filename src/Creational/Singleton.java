package Creational;

public class Singleton {
 private static Singleton  singleton = new Singleton();

    private Singleton() {
    }
    public Singleton getSingleton(){
        return singleton;
    }
}


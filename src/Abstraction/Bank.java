package Abstraction;

// Abstract class with five abstract methods
abstract class Bank {
    abstract void work();
    abstract void information();
    abstract void develop();
    abstract void creation();
    abstract void update();
}

// Concrete class that implements all abstract methods
class MyBank extends Bank {
    @Override
    void work() {
        System.out.println("Bank is processing transactions.");
    }

    @Override
    void information() {
        System.out.println("This bank provides savings and loan services.");
    }

    @Override
    void develop() {
        System.out.println("Developing new banking features.");
    }

    @Override
    void creation() {
        System.out.println("Creating a new customer account.");
    }

    @Override
    void update() {
        System.out.println("Updating account details.");
    }
}
package Abstraction;

public class Test extends Person {
    @Override
    public void learn() {
        System.out.println("Learning...");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.learn();
        t1.learn2();
    }
}

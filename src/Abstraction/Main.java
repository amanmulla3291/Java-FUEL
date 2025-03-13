package Abstraction;

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        MyBank bank = new MyBank();

        // Calling overridden methods
        bank.work();
        bank.information();
        bank.develop();
        bank.creation();
        bank.update();
    }
}

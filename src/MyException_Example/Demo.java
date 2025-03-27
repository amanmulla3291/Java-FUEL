package MyException_Example;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your PIN: ");
            int pin = sc.nextInt();

            System.out.println("Enter Withdraw amount : ");
            int withdraw = sc.nextInt();
            int bal = 10000;

            if (pin == 9525) {

                if (withdraw < bal && withdraw > 0) {
                    bal -= withdraw;
                    System.out.println("Logged in..");
                    System.out.println("Amount withdraw successfully, remaining bal is : " + bal);
                } else {
                    System.out.println("Invalid amount entered.");
                }

            } else {
                try {
                    throw new InvalidPin();
                } catch (InvalidPin e) {
                    System.out.println("Invalid Pin Entered.");
                }
            }
        } finally {
            sc.close();
        }
    }
}

package Exception_Handling;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String uname = sc.nextLine();

        System.out.println("Enter password : ");
        int passwd = 0;
        boolean validInput = false;


        while (!validInput) {
            try {
                passwd = sc.nextInt();
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric password.");
                sc.next();
            }
        }

        if (uname.equals("Sam@123")) {
            if (passwd == 2025) {
                System.out.println("Logged in...");
            } else {
                System.out.println("Invalid password.");
            }
        } else {
            try {
                throw new InvalidUserName();
            } catch (InvalidUserName e) {
                System.out.println("Invalid UserName");
            } finally {
                sc.close();
            }
        }
    }
}
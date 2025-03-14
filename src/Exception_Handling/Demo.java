package Exception_Handling;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program started");

        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("Enter value for A:");
            int A = sc.nextInt();
            System.out.println("Enter value for B:");
            int B = sc.nextInt();
            int C = A / B;
            System.out.println("A / B = " + C);

            System.out.println("A + B = " + (A + B));
        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");
        } finally {

            System.out.println("End of program.");
        }
    }
}
package Exception_Handling;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String uname = sc.nextLine();
        System.out.println("Enter password : ");
        int passwd = sc.nextInt();

        if (uname.equals("Sam@123")) {
            if (passwd==2025){
                System.out.println("Logged in...");
            } else {
                System.out.println("Invalid password.");
            }
        } else {
            try{
                InvalidUserName U1 = new InvalidUserName();
                throw U1;

            } catch (InvalidUserName e) {
                System.out.println("Invalid UserName");
            }
        }
    }
}

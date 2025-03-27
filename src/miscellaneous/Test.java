package miscellaneous;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    Student S1 = new Student(20, "Shawn");
    Student S2 = new Student(24, "Alex");
    Student S3 = new Student(68, "Valentino Rossi");
    Student S4 = new Student(93, "Lewis Hamilton");

    ArrayList<Student> A1 = new ArrayList<>();

    A1.add(S1);
    A1.add(S2);
    A1.add(S3);
    A1.add(S4);
    /*A1.add(20);*/
    /*A1.add("SAM");*/
    System.out.println(A1);

    }
}
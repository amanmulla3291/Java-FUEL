package miscellaneous;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Element 1");
        al.add("Element 2");
        al.add("Element 3");
        al.add("Element 4");
        System.out.println("Array List : " + al);
        //al.addFirst("Element X");
        System.out.println("ArrayList after adding element : " + al);
    }
}

package miscellaneous;

import java.util.ArrayList;

public class ArrayListExample8 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Four");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("One");
        list2.add("Three");
        list2.add("Four");

        System.out.println("Comparing both ArrayLists : " + list1.equals(list2));
    }
}

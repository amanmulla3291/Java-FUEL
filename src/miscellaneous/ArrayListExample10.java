package miscellaneous;

import java.util.ArrayList;

public class ArrayListExample10 {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Hello from l1");
        list1.add("World from l1");

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Hello from l2");
        list2.add("World from l2");

        System.out.println("List 1: " + list1 + "\n List 2: " + list2);
        System.out.println("Adding List 2 in List1 Status : " + list1.addAll(list2));
        System.out.println("Merged List 1 : " + list1);
    }
}

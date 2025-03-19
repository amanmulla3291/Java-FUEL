package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("LinkedList before : " + list);

        list.add(1,7);
        System.out.println("Inserting element at index position : 1 and element is : 7");
        System.out.println("Updated LinkedList : " + list);
    }
}

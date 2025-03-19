package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("LinkedList Before : " + list);
        list.addLast(4);
        System.out.println("LinkedList After : " + list);
    }
}

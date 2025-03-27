package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("LinkedList before : " + list);

        list.addFirst(0);
        list.addLast(5);
        System.out.println("LinkedList after : " + list);
    }
}

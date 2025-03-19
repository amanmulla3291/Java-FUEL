package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample7 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("First occurrence of 1 : " + list.indexOf(1));

        System.out.println("Last occurrence of 4 : " + list.lastIndexOf(4));
    }
}
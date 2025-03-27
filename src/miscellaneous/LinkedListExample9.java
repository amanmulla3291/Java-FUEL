package miscellaneous;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample9 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before : " + list);
        Collections.reverse(list);
        System.out.println(" After : " + list);
    }
}
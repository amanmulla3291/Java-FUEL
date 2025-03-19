package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample10 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int startIndex = 2;
        for (int i = startIndex; i< list.size(); i++){
            System.out.println(i);
        }
    }
}

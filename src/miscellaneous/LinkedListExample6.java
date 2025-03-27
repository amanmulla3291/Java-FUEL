package miscellaneous;

import java.util.LinkedList;

public class LinkedListExample6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        for (String e : list){
            System.out.println(e);
        }
    }
}
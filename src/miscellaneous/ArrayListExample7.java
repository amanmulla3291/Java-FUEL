package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);
    }
}

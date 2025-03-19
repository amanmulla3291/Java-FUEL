package miscellaneous;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample9 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Element1");
            list.add("Element2");
            list.add("Element3");
            System.out.println("ArrayList after swap: " + list);

            Collections.swap(list, 0, 2);
            System.out.println("ArrayList after swap: " + list);
        }
}
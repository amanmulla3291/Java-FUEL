package miscellaneous;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {

        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            list.add("SUBARU");
            list.add("DODGE CHARGER");
            list.add("BMW MK5");

            Collections.sort(list);
            System.out.println("Sorted ArrayList: " + list);
        }
}

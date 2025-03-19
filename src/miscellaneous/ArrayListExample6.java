package miscellaneous;
import java.util.ArrayList;

public class ArrayListExample6 {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>(10);
            System.out.println(" ");
            System.out.println(" ");
            list.add("One");
            list.add("Two");
            list.add("Three");
            list.add("Four");
            list.add("Five");
            list.add("Six");
            list.add("Seven");
            list.add("Eight");
            list.add("Nine");
            list.add("Ten");
            System.out.println("ArrayList with initial capacity: " + list + ", Size :" +list.size()+"\n");

            list.add("Eleven\n");
            System.out.println("ArrayList with updated capacity : " + list + ", Size : " +list.size());
        }
}
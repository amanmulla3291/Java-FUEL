package TreeSet;

import java.util.TreeSet;

public class Fruits {
    public static void main(String[] args) {
        TreeSet<String> tr = new TreeSet<>();
        tr.add("Banana");
        tr.add("Strawberry");
        tr.add("Kiwi");
        tr.add("Apple");
        tr.add("Mango");

        // Here it compares the ASCII values of the first characters of Words added to TreeSet.
        System.out.println(tr);
    }
}

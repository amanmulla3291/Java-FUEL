package TreeSet;

import java.util.TreeSet;

public class TreeSetExample6 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        String largest = treeSet.last();
        System.out.println("Largest element: " + largest);
    }
}

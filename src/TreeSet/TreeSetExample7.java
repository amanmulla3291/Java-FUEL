package TreeSet;

import java.util.TreeSet;

public class TreeSetExample7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        String smallest = treeSet.first();
        System.out.println("Smallest element: " + smallest);
    }
}

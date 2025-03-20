package TreeSet;

import java.util.TreeSet;

public class TreeSetExample5 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        String largest = treeSet.pollLast();
        System.out.println("Largest element removed: " + largest);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}

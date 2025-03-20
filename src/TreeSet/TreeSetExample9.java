package TreeSet;

import java.util.TreeSet;

public class TreeSetExample9 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        String lowest = treeSet.pollFirst();
        System.out.println("Lowest element removed: " + lowest);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}

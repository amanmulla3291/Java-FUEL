package TreeSet;

import java.util.TreeSet;

public class TreeSetExample4 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.remove("Banana");
        System.out.println("TreeSet after : " + treeSet);
    }
}

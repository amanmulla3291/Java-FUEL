package TreeSet;

import java.util.TreeSet;

public class TreeSetExample8 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
        treeSet.add("Apple");
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
    }
}

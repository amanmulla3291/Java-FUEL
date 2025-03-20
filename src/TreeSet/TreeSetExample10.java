package TreeSet;

import java.util.TreeSet;

public class TreeSetExample10 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        String lower = treeSet.lower("Cherry");
        System.out.println("Strictly lower element than 'Cherry': " + lower);
    }
}

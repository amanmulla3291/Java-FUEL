package Map;

import java.util.TreeMap;

public class TreeMapExample8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");

        System.out.println("Greatest Key Entry: " + treeMap.lastEntry());
        System.out.println("Least Key Entry: " + treeMap.firstEntry());
    }
}

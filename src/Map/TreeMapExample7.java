package Map;

import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapExample7 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");

        System.out.println("TreeMap with reverse order: " + treeMap);
    }
}


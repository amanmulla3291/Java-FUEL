package Map;

import java.util.TreeMap;

public class TreeMapExample5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        System.out.println("Keys: " + treeMap.keySet());
    }
}


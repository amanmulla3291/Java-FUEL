package Map;

import java.util.TreeMap;

public class TreeMapExample4 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        System.out.println("Value 'Apple' found: " + treeMap.containsValue("Apple"));
    }
}


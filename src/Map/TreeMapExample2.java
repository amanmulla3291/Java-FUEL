package Map;

import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> originalMap = new TreeMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");

        TreeMap<Integer, String> copyMap = new TreeMap<>(originalMap);
        System.out.println("Copied TreeMap: " + copyMap);
    }
}


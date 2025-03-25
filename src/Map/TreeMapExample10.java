package Map;
import java.util.TreeMap;
import java.util.NavigableSet;

public class TreeMapExample10 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Cherry");

        NavigableSet<Integer> reverseKeys = treeMap.descendingKeySet();
        System.out.println("Reverse Order Keys: " + reverseKeys);
    }
}


package Map;
import java.util.TreeMap;

public class TreeMapExample6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        System.out.println("TreeMap before clearing: " + treeMap);
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}


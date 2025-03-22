package Map;
import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        // Using generics for better type safety
        HashMap<Integer, Object> hs = new HashMap<>();
        hs.put(101, "Sam");
        hs.put(102, "Jam");
        hs.put(104, 104);
        hs.put(105, 104);
        hs.put(106, 104);

        System.out.println(hs);
        System.out.println("----------------");
        System.out.println(hs.containsKey(103));
        System.out.println("----------------");
        System.out.println(hs.get(105));
        System.out.println(hs.isEmpty());

        Set<Integer> snt = hs.keySet();
        for (Integer i : snt) {
            System.out.println(hs.get(i));
        }

        /*
        System.out.println(hs);
        System.out.println(hs.values());
        */
    }
}

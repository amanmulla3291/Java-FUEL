package Map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Mango", 500);
        tm.put("Apple", 180);
        tm.put("Melon", 100);
        tm.put("SitaFal", 560);


        System.out.println(tm);
        //Collection<Integer> fruits = tm.values();
        /*for (int i : fruits) {
            System.out.println(tm.get(i));
        }*/

        /*Set<String> fruits = tm.keySet();
        for (String i : fruits) {
            System.out.println(tm.get(i));
        }
        System.out.println(tm.firstEntry());
        System.out.println(tm.lastEntry());*/

    }
}
package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHash {
    public static void main(String[] args) {
       LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
       lm.put("Sid", 230932);
       lm.put("Dis", 230932);
       lm.put("Sam", 353542);
        System.out.println(lm);

        //For Keys
        Set<String> str = lm.keySet();
        for (String i : str){
            System.out.println(i);
        }

        //For Values
        Collection <Integer> str1 = lm.values();
        for (Integer i : str1){
            System.out.println(i);
        }

    }
}

package LinkHashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Student {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(40);
        a1.add(50);

        LinkedHashSet<Integer> l1 = new LinkedHashSet<>(a1);
        System.out.println(l1);
    }
}

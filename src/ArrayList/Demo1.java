package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

// Appending elements randomly inside array list using index value and element value in add()

public class Demo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        al.add(1,70);
        System.out.println(al);

        al.set(1, 50);
        System.out.println(al);

        for (int i=0; i<al.size(); i++){
            Collections.sort(al);
            System.out.println("_____________________");
            System.out.println(al.get(i));
        }
    }
}
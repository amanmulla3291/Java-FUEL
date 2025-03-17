package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("SAM");
        al.add(20.5);
        al.add(null);
        al.add(20);

        /* Array List. */
        System.out.println("Array List : " + al);
        System.out.println("------------------------------------------");
        /* Size of Array List. */
        System.out.println("Size of Array List: " + al.size());
        System.out.println("------------------------------------------");
        /* Access data by index. */
        System.out.println(al.get(2));
        System.out.println(al.get(4));
        System.out.println("------------------------------------------");
        /* Access data by contains()
         * To check the data is present or not.
         * */
        System.out.println("al.contains(null) " + al.contains(null));
        System.out.println(al.contains("SAM"));

        /* Deleting data using delete()
         * To remove data present in Array List using index value.
         * */
        System.out.println(al.remove(3));
        System.out.println(al);

        /* Access data by contains()
         * To check the data is present or not.
         * */
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}
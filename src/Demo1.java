import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        // al.add("SAM");
        // al.add(20.5);
        al.add(null);
        al.add(20);
        System.out.println("Array List : " + al);
        System.out.println("Array List size : " + al.size());

        LinkedList<Integer> l1 = new LinkedList<>();
        System.out.println("Linked List : " + l1);
        l1.addAll(al);
        System.out.println("Linked List : " + l1);
        System.out.println("Linked List size : " + l1.size());
        System.out.println("                                    ");
        System.out.println("-----Contains() & ContainsAll()-----");
        al.remove(3);
        System.out.println(al.containsAll(l1));
    }
}

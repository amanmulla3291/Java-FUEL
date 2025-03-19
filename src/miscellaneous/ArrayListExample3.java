package miscellaneous;


import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");
        list.add("Element5");

        if (list.size() >= 5) {
            list.remove(4);
        } else {
            System.out.println("The ArrayList has fewer than 5 elements.");
        }
        System.out.println("Updated ArrayList: " + list);
    }
}

package LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(20);
        l1.add(33);
        l1.add(58);
        l1.add(40);
        l1.add(69);

        /*System.out.println(l1);
        System.out.println("----------");
        System.out.println(l1.size());
        System.out.println("----------");
        System.out.println(l1.get(4));*/

        for (int i =1; i<l1.size(); i++){
            if (l1.get(i) %2 == 0){
                System.out.println(l1.get(i));
            }
        }
    }
}
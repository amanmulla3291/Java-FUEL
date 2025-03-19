package Stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack S1 = new Stack();
        S1.add(10);
        S1.push(20);
        S1.push(30);
        S1.push(40);
        S1.push(50);
        S1.push(60);

        System.out.println(S1);
        S1.pop();
        System.out.println(S1);
        System.out.println(S1.peek());
        System.out.println(S1.empty());
        System.out.println(S1.search(30));
    }
}

package Interface;

public class Test implements Person {

    @Override
    public void work(){
        System.out.println("Working...");
    }

    public static void main(String[] args) {
    Test t1 = new Test();
    t1.work();
}
}
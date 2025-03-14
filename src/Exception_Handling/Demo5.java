package Exception_Handling;

public class Demo5 {
    static void div() throws ArithmeticException{
        System.out.println(10/0);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        try{
            div();
        } catch (Exception e){
            System.out.println("By zero.");
        }
        System.out.println("End");
    }
}
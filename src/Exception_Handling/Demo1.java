package Exception_Handling;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Start");
        int [] a = {1,2,3,4,5};
        try{
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds for length 5");
        }
        System.out.println("End.");
    }
}

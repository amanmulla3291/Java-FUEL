package Exception_Handling;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            System.out.println(10/0);

        } catch (ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end.");
        }
    }
}

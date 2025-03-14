package Exception_Handling;

public class Example {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);

        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Out of bound index.");

        } catch (NullPointerException e) {
            System.out.println("WTF");

        }catch (Exception e){
            System.out.println("Exception");

        }
    }
}


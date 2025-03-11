package Polymorphism;

public class Myntra {
    void Purchase(int ProductId) {
        System.out.println(ProductId);
    }

    void Purchase(String ProductName) {
        System.out.println(ProductName);
    }

    void Purchase(int ProductPrice, String Address){
        System.out.println(ProductPrice + Address);
    }

    void Purchase(String Brand, int ContactNumber){
        System.out.println(Brand + ContactNumber);
    }
}

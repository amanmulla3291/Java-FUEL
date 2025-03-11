package Hierarchical_Inheritance;

public class Honda {
    String brand="Honda";
    String engineType;
    int topSpeed;
    double mileage;
    double price;

    Honda(String engineType, int topSpeed, double mileage, double price){
        this.engineType = engineType;
        this.topSpeed = topSpeed;
        this.mileage = mileage;
        this.price = price;
    }
    void Display(){
        System.out.println("Brand:" + brand + ", Engine:" + engineType + ", Speed:" + topSpeed + " km/h, Mileage:" + mileage + " km/l, Price: $" + price);
    }
}

class Bike extends Honda{
    Bike(){
        super("Petrol",180, 40.0, 1500);
    }
}

class Car extends Honda{
    Car(){
        super("Diesel",220, 15.0, 20000);
    }
}

class Scooter extends Honda{
    Scooter(){
        super("Electric",80, 60.0, 1200);
    }
}

class Truck extends Honda{
    Truck(){
        super("Diesel",120, 5.0, 50000);
    }
}

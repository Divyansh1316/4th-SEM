class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a car.");
    }
}

class SportsCar extends Car {
    void display() {
        System.out.println("This is a sports car.");
    }
}

public class demo2a {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.display();
    }
}
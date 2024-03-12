
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

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a bike.");
    }
}

public class demo2b {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.display();
        bike.display();
    }
}
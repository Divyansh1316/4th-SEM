/* 
b) Hierarchical Inheritance
*/

class Vehicle {
    void display1() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void display2() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    void display3() {
        System.out.println("This is a bike");
    }
}

public class task5_2b {
    public static void main(String[] args) {
        Car ob1 = new Car();
        ob1.display1();
        ob1.display2();
        Bike ob2 = new Bike();
        ob2.display1();
        ob2.display3();
    }
}

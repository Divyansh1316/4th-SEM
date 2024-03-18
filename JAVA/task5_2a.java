/*
2.Construct a java program to implement the following inheritances by
taking real case scenarios
a) Multilevel inheritance 
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

class SportsCar extends Car {
    void display3() {
        System.out.println("This is a sports car");
    }
}

public class task5_2a {
    public static void main(String[] args) {
        SportsCar ob = new SportsCar();
        ob.display1();
        ob.display2();
        ob.display3();
    }
}
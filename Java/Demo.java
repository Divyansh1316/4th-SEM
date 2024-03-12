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

public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.display();
    }
}

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

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.display();
        bike.display();
    }
}

// Inside a directory named mypackage
package mypackage;

public class MyClass {
    public static void display() {
        System.out.println("Hello from mypackage!");
    }
}

abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {
    @Override
    double rectangleArea(double length, double width) {
        return length * width;
    }

    @Override
    double squareArea(double side) {
        return side * side;
    }

    @Override
    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of Rectangle: " + area.rectangleArea(5, 4));
        System.out.println("Area of Square: " + area.squareArea(5));
        System.out.println("Area of Circle: " + area.circleArea(5));
    }
}

abstract class Temperature {
    double temp;

    void setTemp(double temp) {
        this.temp = temp;
    }

    abstract void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    @Override
    void changeTemp() {
        ctemp = (5.0 / 9.0) * (temp - 32);
        System.out.println("Temperature in Celsius: " + ctemp);
    }
}

public class Main {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTemp(98.6); // Assuming 98.6°F
        fahrenheit.changeTemp();
    }
}


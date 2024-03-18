/*
5.Implement a java program to calculate the area of a rectangle, a square and a
circle. Create an abstract class 'Shape' with three abstract methods namely
rectangleArea() taking two parameters, squareArea() and circleArea() taking
one parameter each. Now create another class ‘Area’ containing all the three
methods rectangleArea(),squareArea() and circleArea() for printing the area of
rectangle, square and circle respectively. Create an object of class Area and call
all the three methods.
(Use Runtime Polymorphism)
*/

abstract class Shape {
    abstract public void rectangleArea(int a, int b);

    abstract public void squareArea(int x);

    abstract public void circleArea(int y);
}

class Area extends Shape {
    public void rectangleArea(int a, int b) {
        System.out.println("Area of rectangle is : " + a * b);
    }

    public void squareArea(int x) {
        System.out.println("Area of square is : " + x * x);
    }

    public void circleArea(int y) {
        System.out.println("Area of circle is : " + 3.14 * y * y);
    }
}

public class task5_5 {
    public static void main(String[] args) {
        Area ob = new Area();
        ob.rectangleArea(10, 20);
        ob.squareArea(30);
        ob.circleArea(40);
    }
}
abstract class Shape {
    abstract double rectangleArea(double length, double width);

    abstract double squareArea(double side);

    abstract double circleArea(double radius);
}

class Area extends Shape {

    double rectangleArea(double length, double width) {
        return length * width;
    }

    double squareArea(double side) {
        return side * side;
    }

    double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class demo4 {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Area of Rectangle: " + area.rectangleArea(5, 4));
        System.out.println("Area of Square: " + area.squareArea(5));
        System.out.println("Area of Circle: " + area.circleArea(5));
    }
}

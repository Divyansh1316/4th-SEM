/*
8. Implement a java program to create an interface that consists of a method to
display volume () as an abstract method and redefine this method in the derived
classes to suit their requirements.Create classes called Cone, Hemisphere and
Cylinder that implements the interface. Using these three classes, design a
program that will accept dimensions of a cone, cylinder and hemisphere
interactively and display the volumes.
Volume of cone = (1/3)πr2h
Volume of hemisphere = (2/3)πr3
Volume of cylinder = πr2h
*/

interface I {
    void display_volume();
}

class Cone implements I {
    int r, h;

    Cone(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public void display_volume() {
        System.out.println("Volume of cone is : " + (1.0 / 3) * 3.14 * r * r * h);
    }
}

class Hemisphere implements I {
    int r;

    Hemisphere(int r) {
        this.r = r;
    }

    public void display_volume() {
        System.out.println("Volume of cone is : " + (2.0 / 3) * 3.14 * r * r * r);
    }
}

class Cylinder implements I {
    int r, h;

    Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public void display_volume() {
        System.out.println("Volume of cone is : " + 3.14 * r * r * h);
    }
}

public class task5_8 {
    public static void main(String[] args) {
        Cone ob1 = new Cone(5, 10);
        ob1.display_volume();
        Hemisphere ob2 = new Hemisphere(30);
        ob2.display_volume();
        Cylinder ob3 = new Cylinder(10, 20);
        ob3.display_volume();
    }
}
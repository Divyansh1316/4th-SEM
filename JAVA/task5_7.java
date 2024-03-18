/*
7. Write a java program to implement abstract class and abstract method with
following details:
Create a abstract Base Class Temperature
Data members:
double temp;
Method members:
void setTempData(double)
abstact void changeTemp()
Sub Class Fahrenheit (subclass of Temperature)
Data members:
double ctemp;
method member:
Override abstract method changeTemp() to convert Fahrenheit temperature into
degree Celsius by using formula C=5/9*(F-32) and display converted
temperature
Sub Class Celsius (subclass of Temperature)
Data member:
double ftemp;
Method member:
Override abstract method changeTemp() to convert degree Celsius into
Fahrenheit temperature by using formula F=9/5*c+32 and display converted
temperature 
*/

abstract class Temperature {
    double temp;

    public void setTempData(double x) {
        this.temp = x;
    }

    abstract public void changeTemp();
}

class Fahrenheit extends Temperature {
    double ctemp;

    public void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println("Temperature in celcius is : " + ctemp);
    }
}

class Celsius extends Temperature {
    double ftemp;

    public void changeTemp() {
        ftemp = ((9.0 / 5) * temp) + 32;
        System.out.println("Temperature in farenheit is : " + ftemp);
    }
}

public class task5_7 {
    public static void main(String[] args) {
        Fahrenheit ob = new Fahrenheit();
        ob.setTempData(100.00);
        ob.changeTemp();
        Celsius ob2 = new Celsius();
        ob2.setTempData(37.77);
        ob2.changeTemp();
    }
}
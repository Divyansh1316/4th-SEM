/*
6. Implement a java program to implement abstract class and abstract method
with following details:
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
degree Celsius by using formula C=5/9*(F-32) and display converted temperature
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

public class task5_6 {
    public static void main(String[] args) {
        Fahrenheit ob = new Fahrenheit();
        ob.setTempData(100.00);
        ob.changeTemp();
    }
}
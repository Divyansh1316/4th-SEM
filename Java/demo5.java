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

public class demo5 {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit();
        fahrenheit.setTemp(98.6); // Assuming 98.6°F
        fahrenheit.changeTemp();
    }
}
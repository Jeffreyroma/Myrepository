package my.task.hw7;

public class Celsius implements Translatable {

    private double celsius;

    final double kelvin = 0;

    final double fahrenheit = 0;

    public Celsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {return celsius;}

    public void setCelsius(double celsius) {this.celsius = celsius;}

    @Override
    public void transferToKelvin() {
        System.out.println(getCelsius()+ 237.15 + " Degrees kelvin in celsius");
    }

    @Override
    public void transferToFahrenheit() {
        System.out.println( 9 / 5 * getCelsius() + 32 + " Degrees fahrenheit in celsius");
    }
}

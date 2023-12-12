package exerciceTempérature;

public class Temperature {
    public int Celsius;
    public int Fahrenheit;
    public int Kelvin;

    public Temperature(int Celsius, int Fahrenheit, int Kelvin) {
        this.Celsius = Celsius;
        this.Fahrenheit = Fahrenheit;
        this.Kelvin = Kelvin;
    }

    public int getCelsius() {
        return Celsius;
    }

    public void setCelsius(int celsius) {
        Celsius = celsius;
    }

    public int getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        Fahrenheit = fahrenheit;
    }

    public int getKelvin() {
        return Kelvin;
    }

    public void setKelvin(int kelvin) {
        Kelvin = kelvin;
    }
}

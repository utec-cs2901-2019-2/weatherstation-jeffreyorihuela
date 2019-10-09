package cs2901.utec.edu.pe;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 30;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("More Pressure");
        } else if (currentPressure == lastPressure) {
            System.out.println("It is the same Pressure");
        } else if (currentPressure < lastPressure) {
            System.out.println("Less Pressure");
        }
    }
}
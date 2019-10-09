package cs2901.utec.edu.pe;

public class ThirdPartyDisplay implements Observer, DisplayElement {

    float temp;

    public WeatherData weatherData;

    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float preassure) {
        this.temp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Third Party Display shows temp = "+ temp);
    }
}

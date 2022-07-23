public class CurrentConditionDisplay implements DisplayElement, Observer{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 기상 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.humidity = humidity;
        this.temperature = temp;
        display();
    }
}

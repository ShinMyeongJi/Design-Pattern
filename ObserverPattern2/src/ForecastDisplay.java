public class ForecastDisplay implements Observer, DisplayElement{
// 측정치를 바탕으로 기상 에보를 화면에 표시한다.


    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지고 있습니다.");
        }else if(currentPressure == lastPressure) {
            System.out.println("날씨의 변화가 없습니다.");
        }else {
            System.out.println("날씨가 나빠지고 있습니다.");
        }
    }

    @Override
    public void update(float temp, float pressure, float humidity) {
        this.lastPressure = currentPressure;
        this.currentPressure = pressure;

        display();
    }
}

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    List<Observer> observers;
    float temp;
    float pressure;
    float humidity;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this.temp, this.pressure, this.humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }


}

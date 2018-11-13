import java.util.ArrayList;

public class WeatherBase implements Subject {
    private ArrayList<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherBase() {
        observers = new ArrayList<>();
    }

    @Override
    public void AddObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void NotifyObservers() {
        for (Observer o : observers) {
            o.Update(temperature, humidity, pressure);
        }
    }

    public void UpdateMeasures(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        NotifyObservers();
    }


}

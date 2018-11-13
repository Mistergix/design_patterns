public class DisplayConditions implements Observer, IDisplay {

    private float temperature, humidity, pressure;
    private Subject weatherBase;

    public DisplayConditions(Subject subject) {
        weatherBase = subject;
        weatherBase.AddObserver(this);
    }

    @Override
    public void Update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        Display();
    }

    @Override
    public void Display() {
        System.out.println("Temp : " + temperature);
        System.out.println("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
    }
}

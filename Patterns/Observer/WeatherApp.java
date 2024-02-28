package Observer;

public class WeatherApp implements Observer {

    private int temperature;
    private int humidity;

    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        System.out.println("Temperature: " + this.temperature + " Humidity: " + this.humidity);
    }

    public void registerOberservable(Observable observable) {
        observable.addObserver(this);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
    
}

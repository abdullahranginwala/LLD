import Builder.User;
import Observer.WeatherApp;
import Observer.WeatherStation;
import Singleton.TVSet;

public class Driver {
    public static void main(String[] args) {
        // User user = new User.UserBuilder("Abdullah Ranginwala", "abdullahranginwala20@gmail.com", "7984719884").setAge(21).setHeight(172).build();
        // System.out.println(user);

        // TVSet set1 = TVSet.getInstance();
        // TVSet set2 = TVSet.getInstance();
        // TVSet set3 = TVSet.getInstance();

        WeatherApp app1 = new WeatherApp();

        WeatherStation station1 = new WeatherStation();
        WeatherStation station2 = new WeatherStation();
        WeatherStation station3 = new WeatherStation();

        app1.registerOberservable(station1);
        app1.registerOberservable(station2);
        app1.registerOberservable(station3);

        station1.parametersChanged(10, 10);
        System.out.println(app1.getTemperature() + ", " + app1.getHumidity());

        station2.parametersChanged(15, 15);
        System.out.println(app1.getTemperature() + ", " + app1.getHumidity());

        station2.parametersChanged(-1, 0);
        System.out.println(app1.getTemperature() + ", " + app1.getHumidity());
    }
}

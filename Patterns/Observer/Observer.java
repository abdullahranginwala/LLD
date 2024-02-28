package Observer;

public interface Observer {
    public void update(int temperature, int humidity);
    public void registerOberservable(Observable observable);
}

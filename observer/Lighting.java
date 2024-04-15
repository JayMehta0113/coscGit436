package observer;

public class Lighting implements AlarmListener{
    @Override
    public void alarm() {
        System.out.println("Lighting alarm");
    }
}

package observer;

public class Surveillance implements AlarmListener {

    @Override
    public void alarm() {
        System.out.println("Surveillance alarm");
    }
}

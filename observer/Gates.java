package observer;

public class Gates implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Gates alarm");
    }
}

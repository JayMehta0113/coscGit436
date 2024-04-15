package observer;

import java.util.ArrayList;

public class SensorSystem {
    private ArrayList<AlarmListener> listeners = new ArrayList<>();

    public void register(AlarmListener alarmListener) {
        listeners.add(alarmListener);
    }

    public void soundTheAlarm() {
        for (AlarmListener listener : listeners) {
            listener.alarm();
        }
    }
}

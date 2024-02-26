import java.util.ArrayList;

public class Mediator {
    ArrayList<IMediator> im = new ArrayList<>();
    Alarm alarm;

    public void addSmartHome(IMediator im) {
        this.im.add(im);
    }

    public void doTask() {
        for (IMediator im : im) 
            im.doTask();
    }

    public void addAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public Alarm getAlarm() {
        return alarm;
    }

    public void doAlarm() {
        alarm.doAlarm();
    }

    public void endAlarm(String from) {
        alarm.endAlarm(from);
    }
}
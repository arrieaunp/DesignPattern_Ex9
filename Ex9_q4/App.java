public class App {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        IMediator sprinkler = new Sprinkler();
        IMediator coffeepot = new CoffeePot();
        Alarm alarm = new Alarm();

        mediator.addAlarm(alarm);
        mediator.addSmartHome(sprinkler);
        mediator.addSmartHome(coffeepot);

        alarm.setMediator(mediator);
        sprinkler.setMediator(mediator);
        coffeepot.setMediator(mediator);

        mediator.doAlarm(); 
    }
}    


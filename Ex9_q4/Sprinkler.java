public class Sprinkler implements IMediator {
    private Mediator mediator;

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.endAlarm("Sprinkler");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

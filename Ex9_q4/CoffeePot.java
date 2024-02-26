public class CoffeePot implements IMediator{
    private Mediator mediator;

    @Override
    public void doTask() {
        System.out.println("I am coffe pot,... doing my task");
        mediator.endAlarm("Coffee Pot");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    

}

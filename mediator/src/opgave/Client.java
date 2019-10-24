package opgave;

public class Client {
    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator, "svend");
        MobileColleague mobile = new MobileColleague(mediator, "knud");
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.broadcast("Hello World");
        mobile.broadcast("Hello");
    }
}

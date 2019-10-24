package opgave;

public class MobileColleague extends Colleague {
    public MobileColleague(Mediator m, String name) {
        super(m, name);
    }



    public void receive(String message) {
        System.out.println(name +": Mobile Received: " + message);
    }
}

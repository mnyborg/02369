package opgave;

public class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator m, String name) {
        super(m, name);
    }

    public void receive(String message) {
        System.out.println("Colleague "+ name + " received: " + message);
    }
}

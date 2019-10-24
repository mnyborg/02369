package opgave;

public abstract class Colleague {
    private Mediator mediator;
    String name;
    public Colleague(Mediator m) {
        mediator = m;
    }
    public Colleague(Mediator m, String name) {
        mediator = m;
        this.name = name;
    }
    //broadcast a message via the mediator
    public void broadcast (String message) {
        mediator.broadcast(message, this);
    }

    public void send (String message, String name) {
        mediator.send(message, this, name);
    }

    //get access to the mediator
    public Mediator getMediator() {return mediator;}
    public abstract void receive(String message);
}

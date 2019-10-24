public interface Mediator {
    public void broadcast(String message, Colleague colleague);
    public void send(String message, Colleague colleague, String name);

}

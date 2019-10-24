import java.util.ArrayList;

public class ApplicationMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }


    public void broadcast(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for(Colleague colleague: colleagues) {
            //don't tell ourselves
            if(colleague != originator) {
                colleague.receive(message);

            }
        }
    }

    public void send(String message, Colleague originator, String name) {

        for(Colleague colleague: colleagues) {
            //don't tell ourselves, only the person with that name
            if(colleague != originator && colleague.name.equalsIgnoreCase(name)) {
                colleague.receive(message);

            }
        }
    }
}

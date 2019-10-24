public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationMediator m = new ApplicationMediator();

        ConcreteColleague anton =  new ConcreteColleague(m, "Anton");
        ConcreteColleague lise =  new ConcreteColleague(m, "Lise");
        ConcreteColleague bo =  new ConcreteColleague(m, "Bo");

        MobileColleague ib = new MobileColleague(m, "Ib");

        m.addColleague(anton);
        m.addColleague(lise);
        m.addColleague(bo);
        m.addColleague(ib);

        anton.broadcast("Hej med jer");

        lise.send("Hej Anton", "anton");
        ib.send("godmorgen anton", "Anton");



    }
}

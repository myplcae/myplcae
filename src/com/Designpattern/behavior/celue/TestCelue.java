package src.com.Designpattern.behavior.celue;

public class TestCelue {

    public static void main(String[] args) {
        PersonContext person = new PersonContext(new BikeStrategy());
        person.startTravle();

        person.setStrategy(new TrainStrategy());
        person.startTravle();

        person.setStrategy(new PlaneStrategy());
        person.startTravle();
    }
}

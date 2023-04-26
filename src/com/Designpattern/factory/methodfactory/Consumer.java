package src.com.Designpattern.factory.methodfactory;

public class Consumer {

    public static void main(String[] args) {
        Car car = new WulinFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new BenziFactory().getCar();

        car.name();
        car1.name();
        car2.name();
    }
}

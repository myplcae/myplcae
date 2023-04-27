package src.com.Designpattern.create.factory.methodfactory;

public class Test {

    public static void main(String[] args) {
        Car car = new WulinFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new BenziFactory().getCar();

        car.name();
        car1.name();
        car2.name();
    }
}
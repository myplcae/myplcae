package src.com.Designpattern.create.factory.methodfactory;

public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}

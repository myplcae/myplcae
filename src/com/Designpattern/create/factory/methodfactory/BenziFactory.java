package src.com.Designpattern.create.factory.methodfactory;

public class BenziFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
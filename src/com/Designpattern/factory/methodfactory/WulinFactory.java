package src.com.Designpattern.factory.methodfactory;

public class WulinFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}

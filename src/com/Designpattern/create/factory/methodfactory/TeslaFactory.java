package src.com.Designpattern.create.factory.methodfactory;
//工厂方法模式
public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}

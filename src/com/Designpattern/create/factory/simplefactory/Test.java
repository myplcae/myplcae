package src.com.Designpattern.create.factory.simplefactory;
//简单工厂模式
public class Test {

    public static void main(String[] args) {
        //接口，所有的实现类
//        Car car = new WuLing();
//        Car car1 = new Tesla();

        //使用工厂创建
        Car car = CarFactory.getCar("五菱");
        Car car1 = CarFactory.getCar("特斯拉");
        car.name();
        car1.name();
    }
}

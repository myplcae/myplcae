package src.com.Designpattern.structure.Flyweight;
//享元模式
public class TestFlyweight {

    public static void main(String[] args) {
        Charge charge1 = Factory.getInstance().getCharge();
        charge1.use(new Person("张三"));
        charge1.back();
        Charge charge2 = Factory.getInstance().getCharge();
        charge2.use(new Person("李四"));
        Charge charge3 = Factory.getInstance().getCharge();
        charge3.use(new Person("王五"));
        charge2.back();
        charge3.back();
    }
}

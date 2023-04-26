package src.com.Designpattern.structure.adapter;
//真正的适配器，连接网线和电脑
//1.用继承的方式实现（java单继承）
//2、组合的方式实现（常用）
public class Adapters extends Adapter implements NetToUsb{
    @Override
    public void handleRequest() {
        super.request();//可以上网了
    }

    public static void main(String[] args) {
        //电脑，适配器，网线
        TestComputer computer = new TestComputer();
        Adapter adapter = new Adapter();
        //Adapters adapters = new Adapters();
        Adapters2 adapters = new Adapters2(adapter);

        computer.net(adapters);
    }
}

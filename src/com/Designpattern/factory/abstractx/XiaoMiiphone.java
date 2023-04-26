package src.com.Designpattern.factory.abstractx;

public class XiaoMiiphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米关机");
    }

    @Override
    public void callup() {
        System.out.println("用小米手机打电话");
    }

    @Override
    public void sendMS() {
        System.out.println("用小米发消息！！");
    }
}

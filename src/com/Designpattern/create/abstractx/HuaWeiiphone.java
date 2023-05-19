package src.com.Designpattern.create.abstractx;

public class HuaWeiiphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为关机");
    }

    @Override
    public void callup() {
        System.out.println("用华为手机打电话");
    }

    @Override
    public void sendMS() {
        System.out.println("用华为发消息！！");
    }
}

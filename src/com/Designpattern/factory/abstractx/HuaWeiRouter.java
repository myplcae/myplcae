package src.com.Designpattern.factory.abstractx;

public class HuaWeiRouter implements IRouterProducter{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWife() {
        System.out.println("启动华为Wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置");
    }
}

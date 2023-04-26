package src.com.Designpattern.create.factory.abstractx;

public class XiaoMiRouter implements IRouterProducter{
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("启动小米Wifi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}

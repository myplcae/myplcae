package src.com.Designpattern.factory.abstractx;

public class XiaomiFactory implements IproductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaoMiiphone();
    }

    @Override
    public IRouterProducter irouterproducter() {
        return new XiaoMiRouter();
    }
}

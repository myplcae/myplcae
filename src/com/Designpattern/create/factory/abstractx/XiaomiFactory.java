package src.com.Designpattern.create.factory.abstractx;

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

package src.com.Designpattern.create.abstractx;

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

package src.com.Designpattern.factory.abstractx;

public class HuaweiFactory implements IproductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiiphone();
    }

    @Override
    public IRouterProducter irouterproducter() {
        return new HuaWeiRouter();
    }
}

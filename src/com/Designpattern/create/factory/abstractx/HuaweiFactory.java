package src.com.Designpattern.create.factory.abstractx;

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

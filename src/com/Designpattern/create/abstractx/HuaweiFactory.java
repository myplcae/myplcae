package src.com.Designpattern.create.abstractx;

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

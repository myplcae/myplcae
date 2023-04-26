package src.com.Designpattern.create.factory.abstractx;
//抽象产品工厂
public interface IproductFactory {

    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRouterProducter irouterproducter();
}

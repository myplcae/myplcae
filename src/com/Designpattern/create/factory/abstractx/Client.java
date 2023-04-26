package src.com.Designpattern.create.factory.abstractx;

public class Client {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~小米系列~~~~~~~~~~~~~~~~");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendMS();

        //路由器
        IRouterProducter irouterproducter = xiaomiFactory.irouterproducter();
        irouterproducter.openWife();
        irouterproducter.shutdown();

        System.out.println("------------华为产品---------------");

        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct1 = huaweiFactory.iphoneProduct();

        iphoneProduct1.start();
        iphoneProduct1.callup();
        iphoneProduct1.shutdown();

        //华为路由器
        IRouterProducter irouterproducter1 = huaweiFactory.irouterproducter();
        irouterproducter1.openWife();
        irouterproducter1.setting();
        irouterproducter1.shutdown();
    }
}

package src.com.Designpattern.structure.agent;
//代理模式
public class Testagent {

    public static void main(String[] args) {
//        Contra contra = new Contra();
//        ContraProxy contraProxy = new ContraProxy(contra);
//        contraProxy.play();
        //强制代理
        ContraProxy contraProxy = Contra.getProxy();
        contraProxy.play();
    }
}

package src.com.Designpattern.create.builder.demo1;
//具体的建造者
public class Worker extends Builder{

    private Product product;

    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋");
        System.out.println("钢筋");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("刷墙");
        System.out.println("刷墙");
    }

    @Override
    Product getProduct() {
        return product;
    }
}

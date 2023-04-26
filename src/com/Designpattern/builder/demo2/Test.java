package src.com.Designpattern.builder.demo2;

public class Test {

    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        //链式编程：在原来的基础上可以自由组合，也有默认的套餐
        Product product = worker.builderA("吃一个华莱士窜稀套餐").builderB("还要加上麦当娜的薯条")
                .builderC("以及百事可乐").builderD("再加上一个水果蛋糕")
                .getProduct();
        System.out.println(product.toString());
    }
}

package src.com.Designpattern.structure.bridge;
//抽象电脑类
public abstract class Computer {

    //组合，品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    public void info(){
        //自带品牌
        brand.info();
    }
}

class Deskopt extends Computer{

    public Deskopt(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("台式机~~~~~~~~~~~~");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("笔记本！！！！！！！！！！！！");
    }
}
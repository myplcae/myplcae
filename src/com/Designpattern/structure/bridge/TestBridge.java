package src.com.Designpattern.structure.bridge;

public class TestBridge {

    public static void main(String[] args) {
        //华为笔记本
        Computer computer = new Laptop(new HuaWei());
        computer.info();
        //联想台式机
        Computer computer1 = new Deskopt(new Lenovo());
        computer1.info();
    }
}

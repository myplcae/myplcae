package src.com.Designpattern.structure.decorator;
//一个具体的桌子，红木桌子
public class RedwoodTable extends Table{

    @Override
    void show() {
        System.out.println("这是一张红木桌子");
    }
}

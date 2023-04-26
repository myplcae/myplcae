package src.com.Designpattern.structure.decorator;
//开始修饰桌子，先加个杯子
public class TableAddCup extends TableDecorator{


    public TableAddCup(Table table) {
        super(table);
    }

    @Override
    void show() {
        super.show();
        System.out.println("我把杯子放上了桌子");
    }
}

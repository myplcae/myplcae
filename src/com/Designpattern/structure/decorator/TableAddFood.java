package src.com.Designpattern.structure.decorator;
//再加点吃的上去
public class TableAddFood extends TableDecorator{

    public TableAddFood(Table table) {
        super(table);
    }

    @Override
    public void show() {
        super.show();
        System.out.println("我又把零食放上了桌子！！！！！");
    }
}

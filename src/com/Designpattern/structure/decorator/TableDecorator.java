package src.com.Designpattern.structure.decorator;
//接下来修饰这个桌子，这是一个桌子的修饰器
//修饰器从桌子衍生而来，所以是一种特殊的桌子，是装饰过的桌子
public class TableDecorator extends Table{
    //修饰器中有个私有成员是桌子类型
    private Table table;
    //构造方法接受一个桌子类型的参数
    public TableDecorator(Table table){
        this.table = table;
    }

    @Override
    void show() {
        //先调自己修饰的桌子
        table.show();
    }
}

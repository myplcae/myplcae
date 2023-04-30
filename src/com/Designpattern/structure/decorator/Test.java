package src.com.Designpattern.structure.decorator;
//装饰器模式
public class Test {
    /**
     * 例：装饰一张桌子
     * */
    public static void main(String[] args) {
        //开始调用,创建一个红木桌子
        Table table = new RedwoodTable();
        //table.show();
        //在桌子上放东西
        table = new TableAddCup(table);
        table.show();
        table = new TableAddFood(table);
        table.show();
    }
}

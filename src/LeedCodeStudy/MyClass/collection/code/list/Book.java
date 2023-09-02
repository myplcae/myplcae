package src.LeedCodeStudy.MyClass.collection.code.list;

public class Book {

    //书名
    private String name;
    //价格
    private double price;
    //作者
    private String aothor;

    public Book(String name, double price, String aothor) {
        this.name = name;
        this.price = price;
        this.aothor = aothor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAothor() {
        return aothor;
    }

    public void setAothor(String aothor) {
        this.aothor = aothor;
    }

    @Override
    public String toString() {
        return "名称："+name+"\t\t 价格："+price+"\t\t作者："+aothor;
    }
}

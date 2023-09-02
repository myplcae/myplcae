package src.LeedCodeStudy.MyClass.collection.code.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings("all")
public class CollectionIterator {

    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new book("三国演义","罗贯中",10.1));
        col.add(new book("红楼梦","曹雪芹",10.8));
        col.add(new book("水浒传","施耐庵",9.5));
        col.add("chenmingming");
        //System.out.println("col=" + col);
        //使用while遍历此集合
        Iterator iterator = col.iterator();
        //判断是否还有数据
//        while (iterator.hasNext()){
//            //返回下一个元素，类型为Object
//            Object obj = iterator.next();
//            System.out.println("obj="+ obj);
//        }
        //快捷键：itit
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj="+ obj);

        }
        //退出循环后，迭代器指向最后的元素
        //iterator.next();//异常：NoSuchElementException
        //如果希望再次遍历，则需要重置迭代器
        iterator = col.iterator();
        System.out.println("~~~~~~~~~~~~~~~~~~~~重置迭代器~~~~~~~~~~~~~~~~~");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj="+ obj);

        }
    }
}

class book {

    private String name;
    private String author;
    private double price;

    public book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
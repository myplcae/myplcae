package src.LeedCodeStudy.MyClass.collection.homework;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"all"})
public class HomeWork_02 {
    public static void main(String[] args) {
        //1、用ArrayList添加两个元素
        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car1 = new Car("宝马", 400000);
        arrayList.add(car);
        arrayList.add(car);
        arrayList.add(new Car("红旗",40000000));
        arrayList.add(new Car("比亚迪",700000));
        arrayList.add(new Car("宾利",5000000));
        arrayList.add(new Car("布加迪",25000000));
        System.out.println(arrayList);
        //2、删除指定元素
        arrayList.remove(car);
        System.out.println(arrayList);
        //3、查找元素是否存在
        System.out.println(arrayList.contains("宝马"));
        //4、获取元素个数
        System.out.println(arrayList.size());
        //判空
        System.out.println(arrayList.isEmpty());
        //清除集合
        //arrayList.clear();
        System.out.println(arrayList);
        //添加多个元素
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        //查找多个元素
        System.out.println(arrayList.containsAll(arrayList));
        //删除多个元素,相当于清空
         //arrayList.removeAll(arrayList);
        System.out.println(arrayList);
        //增强for遍历
        for (Object o :arrayList) {
            System.out.println("增强for------arrayList集合现在包括：" + o);
        }
        //迭代器输出
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println("迭代器--------arrayList集合现在包括：" + o);
        }

    }
}
class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

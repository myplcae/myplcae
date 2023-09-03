package src.LeedCodeStudy.MyClass.collection.code.Set;

import java.util.LinkedHashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("奔驰",1000000));
        set.add(new Car("BMW",1500000));
        set.add(new Car("红旗",2000000));
        set.add(new Car("比亚迪",1058000));
        set.add(new Car("奥迪",308000));
        set.add(new Car("奥迪",308000));
        set.add(new Car("奥拓",38000));

        System.out.println("set = " + set);
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //重写equals和hashcode,两个参数相同时返回相同的hashcode值

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

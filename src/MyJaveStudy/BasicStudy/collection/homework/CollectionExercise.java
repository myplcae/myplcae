package src.MyJaveStudy.BasicStudy.collection.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 家庭作业
 * */
public class CollectionExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小黑",3));
        list.add(new Dog("旺财",1));
        list.add(new Dog("云朵",11));
        
        //先试用增强for
        System.out.println("!!!!!!!!!!使用增强for方法遍历!!!!!!!!!!");
        for (Object dog : list) {
            System.out.println("dog="+dog);
        }
        //使用迭代器
        System.out.println("~~~~~~~使用迭代器方法遍历~~~~~~~~~");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog =  iterator.next();
            System.out.println("dog="+dog);
            
        }

    }
}
/**
 * 创建3个dog（name,age）对象，放到ArrayList中，赋给List引用引用迭代器和增强for两种方式遍历
 * 重写dog的tostring方法
 * */
class Dog{
    private String name;
    private Integer age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}

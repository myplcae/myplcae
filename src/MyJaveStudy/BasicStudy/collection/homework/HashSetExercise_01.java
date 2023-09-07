package src.MyJaveStudy.BasicStudy.collection.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * 创建3个对象放到hashSet集合中
 * 如果名称和年龄都一样则代表相同，相同的人不能放到set中
 * */
@SuppressWarnings("all")
public class HashSetExercise_01 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet<>();
        hashSet.add(new Employee_01("张开国",27));
        hashSet.add(new Employee_01("陈明明",29));
        hashSet.add(new Employee_01("张开国",27));

        System.out.println("hashSet= " + hashSet);
    }
}
class Employee_01{
    private String name;//名称
    private Integer age;//年龄

    public Employee_01(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //如果name和age相同则重写hash值
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_01 employee = (Employee_01) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

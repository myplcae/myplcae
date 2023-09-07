package src.MyJaveStudy.BasicStudy.collection.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        Object employee1 = map.put(1, new Emp("张开国", 1, 250000.00));
        Object employee2 = map.put(2, new Emp("陈明明", 2, 12500.00));
        Object employee3 = map.put(3, new Emp("小范", 3, 25250.00));
        Object employee4 = map.put(4, new Emp("西西姐", 4, 2525.00));

        //遍历
        //keyset方式->增强for
        System.out.println("~~~~~~~~~keyset方式~~~~~~~~~");
        Set keySet = map.keySet();
        for (Object key : keySet) {
            //寻找大于18000工资的那条数据
            Emp emp = (Emp) map.get(key);
            if (emp.getSalary() > 18000){
                System.out.println(emp);
            }
        }
        //迭代器entry输出
        System.out.println("~~~~~~~~~~迭代器entry输出~~~~~~~~~~");
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getClass());
            Emp emp = (Emp) entry.getValue();
            if (emp.getSalary() > 18000){
                System.out.println(emp);
            }
        }

    }
}
class Emp{
    private String name;
    private int num;
    private double salary;

    public Emp(String name, int num, double salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", salary=" + salary +
                '}';
    }

}

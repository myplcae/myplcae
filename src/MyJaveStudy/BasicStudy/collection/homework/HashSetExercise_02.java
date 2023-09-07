package src.MyJaveStudy.BasicStudy.collection.homework;

import java.util.HashSet;
import java.util.Objects;
@SuppressWarnings("all")
public class HashSetExercise_02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee_02("张开国",2500,new Mydate(1995,4,10)));
        hashSet.add(new Employee_02("张开国",2500,new Mydate(1995,4,10)));
        hashSet.add(new Employee_02("陈明明",5000,new Mydate(1993,7,5)));
        System.out.println("hashSet = " + hashSet.toString());
    }
}
class Employee_02{
    private String name;//名称
    private int sal;//工资
    private Mydate birthday;//出生日期

    public Employee_02(String name, int sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee_02{" +
                "name='" + name + '\'' +
                ", sal='" + sal + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_02 employee2 = (Employee_02) o;
        return Objects.equals(name, employee2.name) &&
                Objects.equals(birthday, employee2.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class Mydate{
    private int year;
    private int month;
    private int day;

    public Mydate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                year +"年"+
                month +"月"+
                day +"日"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mydate mydate = (Mydate) o;
        return year == mydate.year && month == mydate.month && day == mydate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

}
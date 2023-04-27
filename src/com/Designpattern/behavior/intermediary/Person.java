package src.com.Designpattern.behavior.intermediary;

import java.util.List;

public abstract class Person {

    protected String name;

    protected int sex;//1为男性，2为女性

    protected  int age;

    protected Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Person(String name, int sex, int age, int minage, int maxage){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.Minage = minage;
        this.Maxage = maxage;
    }

    public List<Person> findLove(){
        return mediator.match(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", Minage=" + Minage +
                ", Maxage=" + Maxage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMinage() {
        return Minage;
    }

    public void setMinage(int minage) {
        Minage = minage;
    }

    public int getMaxage() {
        return Maxage;
    }

    public void setMaxage(int maxage) {
        Maxage = maxage;
    }

    protected int Minage;//最小期望年龄

    protected int Maxage;//最大期望年龄
}

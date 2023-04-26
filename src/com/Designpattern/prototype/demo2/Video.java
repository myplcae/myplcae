package src.com.Designpattern.prototype.demo2;

import java.util.Date;

//抄别人的
/**
 * 1.实现一个接口
 * 2.重写一个方法
 * */
public class Video implements Cloneable{
    //名字
    private String name;
    //创建日期
    private Date creatTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        //实现深克隆，将对象属性也进行克隆；也可以进行序列化或者反序列化
        Video v = (Video) obj;
        //将对象的属性也克隆
        v.creatTime = (Date) this.creatTime.clone();
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Video(){

    }
    public Video(String name,Date creatTime) {
        this.name = name;
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }
}

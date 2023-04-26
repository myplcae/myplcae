package src.com.Designpattern.prototype.demo1;

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
        return super.clone();
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

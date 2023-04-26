package src.com.Designpattern.create.prototype.demo2;

import java.util.Date;
//spring里边的bean除了使用单例模式之外还使用了原型模式
//同时原型模式还会跟工厂模式打交道
//客户端：深克隆
public class Bilibili {

    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象
        Date date = new Date();
        Video v1 = new Video("狂神说Java", date);
        Video v2 = (Video)v1.clone();
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);
        System.out.println("===============================");
        date.setTime(221151545);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("v1=>hash"+v1.hashCode());

        //克隆出v2
        //克隆出来的对象和原来是一模一样的
//        Video v2 = (Video)v1.clone();
//        System.out.println("v2=>"+v2);
//        System.out.println("v2=>hash:"+v2.hashCode());

//        v2.setName("盗版狂神");
//        System.out.println(v2);

    }
}

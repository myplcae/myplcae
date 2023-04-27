package src.com.Designpattern.behavior.command;
//电视
public class TV {

    //打开电视
    void Open(){
        System.out.println("打开电视机");
    }
    //待机
    void stayOn(){
        System.out.println("电视待机");
    }
    //关机
    void turnOff(){
        System.out.println("电视被关机了");
    }
}

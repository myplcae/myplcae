package src.com.Designpattern.behavior.celue;

public class BikeStrategy implements Strategy{

    @Override
    public void travle() {
        System.out.println("我TM直接脚踩自行车出行");
    }
}

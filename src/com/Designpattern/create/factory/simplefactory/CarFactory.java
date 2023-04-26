package src.com.Designpattern.create.factory.simplefactory;

public class CarFactory {

    public static Car getCar(String car){
        if ("五菱".equals(car)){
            return new WuLing();
        } else if ("特斯拉".equals(car)) {
            return new Tesla();
        }else {
            return null;
        }
    }
}

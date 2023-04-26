package src.com.Designpattern.singlePattern;
/**
 * 静态内部类
 *
 * */
public class Holder {
    //构造器私有
    private Holder(){}
    public static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}

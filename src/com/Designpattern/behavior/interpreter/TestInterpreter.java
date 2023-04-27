package src.com.Designpattern.behavior.interpreter;
//解释器模式
public class TestInterpreter {

    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.isFree("北京的张开国"));
        System.out.println(context.isFree("南京的张开国"));
        System.out.println(context.isFree("日本的大桥老师"));
        System.out.println(context.isFree("欧洲的白皮猪"));
        System.out.println(context.isFree("非洲的倪哥"));
    }
}

package src.MyJaveStudy.BasicStudy.StringStudy.code;
/**
 * 拼接字符串
 * */
public class TestConcat {
    public static void main(String[] args) {
        String str = String.join("-","hello","world",new StringBuffer("!"));//返回值类型为String类型
        System.out.println(str);//hello-world-!,String 和 StringBuffer都可以使用因为是CharSequence对象
    }
}

package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Pattern;

//演示matcher方法
public class PatternMethod {
    public static void main(String[] args) {
        String content = "hello abc 111，小徐学正则";
        //String regString = "hello";//false
        String regString = "hello.*";//true
        boolean matches = Pattern.matches(regString, content);
        System.out.println("整体匹配 = " + matches);
    }

}

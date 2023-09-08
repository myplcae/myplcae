package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello tom jack edu hspedu smith hello hspedu hspedu";
        String regString = "hello";
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("==========================");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("找到：" + content.substring(matcher.start(),matcher.end()));
        }
        //整体匹配方法，常用于某个字符串是否满足某个规则
        System.out.println("整体匹配结果为：" + matcher.matches());

        //如果content有hspdu就换成韩顺平教育
        regString = "hspedu";
        pattern = Pattern.compile(regString);
        matcher = pattern.matcher(content);
        String newregString = matcher.replaceAll("韩顺平教育");
        System.out.println("newregString = " + newregString);


    }
}

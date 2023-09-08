package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {
    public static void main(String[] args) {
        String content = "hanshuping ashajhs 5422as 6781han";
        //非命名分组
        String regString = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了：" + matcher.group(0));
            System.out.println("找到了第一个分组的内容：" + matcher.group(1));
            System.out.println("找到了第一eeeeeeee个分组的内容：" + matcher.group("g1"));//方式二
            System.out.println("找到了第二个分组的内容：" + matcher.group(2));
            //System.out.println("找到了第二个分组的内容：" + matcher.group(3));//越界
        }
    }
}

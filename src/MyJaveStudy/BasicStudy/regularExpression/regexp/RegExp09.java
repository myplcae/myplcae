package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 非贪婪匹配
 * */
public class RegExp09 {
    public static void main(String[] args) {
        String content = "helloweuhgyuwie11111111 ok";
        String regString = "\\d+";

        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了：" + matcher.group(0));
        }
    }
}

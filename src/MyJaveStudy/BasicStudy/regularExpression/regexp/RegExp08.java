package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp08 {

    public static void main(String[] args) {
        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";
        //String regString = "韩顺平教育|韩顺平老师|韩顺平同学";
        //改
        //String regString = "韩顺平(?:教育|老师|同学)";
        //String regString = "韩顺平(?=教育|老师)";
        String regString = "韩顺平(?!=教育|老师)";
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了：" + matcher.group(0));
        }
    }
}

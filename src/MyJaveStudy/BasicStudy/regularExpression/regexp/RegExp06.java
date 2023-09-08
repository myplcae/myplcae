package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示定位符
 * */
public class RegExp06 {
    public static void main(String[] args) {
        String content = "123abcA";//如果
        //^代表起始位置如果起始位置不是1了就找不到了
        //String regString = "^[0-9]+[a-z]*";
        //$代表以什么结束如果不是以规定大小写字母结尾则匹配不到
        //如果没有\\-则同样匹配不成功
        String regString = "^[0-9]+[a-z]+$";
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了：" + matcher.group(0));
        }
    }
}

package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示匹配符的使用
 * */
public class RegExp03 {
    public static void main(String[] args) {
        String content =  "xujin_maxAMAX$***&&& @@sal_26...00  0";
        //String regString = "[^a-z]";//匹配a-z之间的字符
        //String regString = "[abcd]";//匹配a-z之间的字符
        //String regString = "\\w";//匹配a-z之间的字符以及数字和下划线，包括大小写,不包括特殊字符
        //String regString = "\\W";//取出特殊字符
        //String regString = "\\s";//找到空格和制表符（table键打出来的长空格）
        //String regString = "\\S";//找到除空格和制表符之外的所有符号
        String regString = "\\.";
        //String regString1 = "[A-Z]";//匹配A-Z之间的字符
        //String regString1 = "[0-9]";//匹配A-Z之间的字符
        //String regString2 = "max";//匹配A-Z之间的字符不区分大小写,可以在pattern里带参数：Pattern.CASE_INSENSITIVE是同样的效果
        //Pattern pattern = Pattern.compile(regString);
        //Pattern pattern = Pattern.compile(regString1);
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);

        //查找输出
        while (matcher.find()){
            System.out.println("找到所需字符包括：" + matcher.group(0));
        }
    }
}

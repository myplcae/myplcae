package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 限定符的使用
 * */
public class RegExp05 {

    public static void main(String[] args) {
        String content = "111111aa1aa1abbbbb12455sas1xzsaws";
        //String regString = "a{3}";//表示查找aaa
        //String regString = "1{5}";//表示匹配五个1
        //String regString = "\\d{5}";//五位的任意数字
        //String regString = "a{3,4}";//匹配aa 或者aaa,尽可能匹配多的
        //String regString = "\\d{5,6}";//匹配两位数或者六位数的数字
        //String regString = "1+";//匹配1个1或者多个1
        //String regString = "\\d+";
        //String regString = "1*";//匹配0个1或者多个1，会遍历整个字符串
        String regString = "a1?";//匹配a或者a1
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了符号：" + matcher.group(0));
        }
    }
}

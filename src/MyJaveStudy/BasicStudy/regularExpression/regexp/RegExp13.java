package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//结巴程序
public class RegExp13 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学....编程java";
        //换成我要学Java
        //去掉所有的.
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content  = matcher.replaceAll("");
        System.out.println("content = " + content);
        //找到重复出现的字
        pattern = Pattern.compile("(.)\\1+");
        matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("content = " + matcher.group(0));
        }
        //使用反向引用----------$1---------------替换匹配到的重复内容
        content = matcher.replaceAll("$1");
        System.out.println("最后获得的字符串content的结果 = " + content);


        //去掉复杂语句，一句话解决
        Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println("一条代码计算后最后获得的字符串content的结果 = " + content);
    }
}

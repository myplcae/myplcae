package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//选择匹配符
public class RegExp04 {
    public static void main(String[] args) {
        String content = "xujin 徐进 4634658 杨露涵 luhan";
        String regString = "xujin|杨露涵";

        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了符号：" + matcher.group(0));
        }
    }
}

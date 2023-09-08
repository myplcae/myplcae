package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTemp {
    public static void main(String[] args) {
        String content = "hello abc 111";
        String regString = ".";//匹配除了\n的所有字符
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
        }
    }
}

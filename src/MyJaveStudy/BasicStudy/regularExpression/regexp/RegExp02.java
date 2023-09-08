package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//转义符
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(abc.(123(";
        //匹配（
        //这里如果没有双斜杠转义符会报错,java 里的双斜杠代表其他语言里的单斜杠
        /**
         * 常见的转移符号： ，* + ( ) { } $ / \ ?
         * */
       // String regString = "\\(";
        String regString1 = "\\.";//如果没有转义符会输出所有的字母和符号，如果有才会输出点
        Pattern pattern = Pattern.compile(regString1);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到了符号：" + matcher.group(0));
        }
    }
}

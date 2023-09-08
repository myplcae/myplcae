package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//反向引用测试案例
public class RegExp12 {
    public static void main(String[] args) {
        String content = "hello jack11111 tom11 jack22 zk1551h12 55555 cmm 12321-333999111";
        //找到两个连续的数字
        String regString = "(\\d)\\1";
        //找到五个连续相同的数字
        String regString1 = "(\\d)\\1{4}";
        //匹配个位与千位相同，十位与百位相同的数字
        String regString2 = "(\\d)(\\d)\\2\\1";
        /**
         * 请在字符串中检索商品编号,形式如:12321-333999111 这样的号码,
         * 要求满足前面是一个五位数,然后一个-号,然后是一个九位数,连续的每三位要相同
         * */
        String regString3 = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern pattern = Pattern.compile(regString3);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到：" + matcher.group(0));
        }
    }
}

package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings({"all"})
//应用实例
public class RegExp10 {
    public static void main(String[] args) {
        String content= "韩顺平教育";//测试汉字
        String content1= "400401";//测试邮政编码
        String content2 = "1479846498";//测试qq号
        String content3 = "15696417238";//测试手机号
        //汉字
        String regString = "^[\u0391-\uffe5]+$";
        //邮政编码
        String regString1 = "^[1-9]\\d{5}$";
        //QQ号
        String regString2 = "^[1-9]\\d{4,9}$";
        //手机号
        String regString3 = "^1[3|4|5|6|7|8|9]\\d{9}$";
        Pattern pattern = Pattern.compile(regString3);
        Matcher matcher = pattern.matcher(content3);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
    }
}

package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV1fh411y7R8/?spm_id_from=333.999.0.0&vd_source=b9dd9476cbe0f58b618c1bb448c767f2";
        //String content1 = "https://www.bilibili.com/video/BV1Eq4y1E79W?p=17&spm_id_from=pageDriver&vd_source=b9dd9476cbe0f58b618c1bb448c767f2";
        /**
         * 1、先确定URL的开始部分：http或者https
         * 2、([\w-]+\.)+[\w-]匹配网址
         * */
        String regString = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?+$";//如果.在中括号里面则代表匹配.本身
        Pattern pattern = Pattern.compile(regString);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()){
            System.out.println("满足格式");
        }else {
            System.out.println("不满足格式");
        }
        //用PatternMethod整体匹配
        System.out.println(Pattern.matches(regString,content));
    }
}

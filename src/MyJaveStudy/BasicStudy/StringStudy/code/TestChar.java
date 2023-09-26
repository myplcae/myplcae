package src.MyJaveStudy.BasicStudy.StringStudy.code;

import java.io.UnsupportedEncodingException;
import java.sql.SQLOutput;
@SuppressWarnings({"all"})
public class TestChar {
    public static void main(String[] args) {
        String s = "你好Java";
        try {
            byte[] bytes = s.getBytes("GB2312");
            byte[] bytes1 = s.getBytes("UTF-16");
            byte[] bytes2 = s.getBytes("UTF-8");
            System.out.println(bytes.length);//8
            System.out.println(bytes1.length);//14
            System.out.println(s.length());//6
            System.out.println(bytes2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        char c = '\u0041';
        String s1 = "\u0041\u0042\u0043";
        System.out.println("c=" + c);//c=A
        System.out.println("s=" + s1);//s=ABC
    }
}

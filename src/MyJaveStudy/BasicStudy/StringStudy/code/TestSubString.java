package src.MyJaveStudy.BasicStudy.StringStudy.code;
/**
 * 截取字符串
 * */
public class TestSubString {
    public static void main(String[] args) {
        String s = "hello world";
        char c = s.charAt(4);
        String s1 = "  asdsdwq  ";
        String s2 = "\r  hello world  \r";
        String result = s.substring(1,4);
        String result1 = s.substring(1);//验证左闭右开原则
        String result3 = s1.trim();
        CharSequence reslut2 = s.subSequence(1,4);
        System.out.println(result);//ell,截取下标为1-4的字符
        System.out.println(result1);//ello world
        System.out.println(reslut2);//ell
        System.out.println(result3);//asdsdwq trim用来去除首尾的空字符，不会去掉字符间的空字符
        System.out.println(s2.trim().length());//hello world ,回去出首尾两端的空格和换行
        System.out.println(c);//o
    }
}

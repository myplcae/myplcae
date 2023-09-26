package src.MyJaveStudy.BasicStudy.StringStudy.code;
/**
 * 转换字符串
 * */
public class TestconversionStr {
    public static void main(String[] args) {
        String s = "hello world";
        char[] chars = s.toCharArray();//把字符串转换成字符集
        String result = String.valueOf(new char[]{'h','e','l','l','o'},2,3);//下标为2向后取3位
        String result1 = String.copyValueOf(new char[]{'h','e','l','l','o'},2,3);//与上面的结果一直，但是这份方法只能转化字符数组
        System.out.println(result1);
        System.out.println(result);
    }
}

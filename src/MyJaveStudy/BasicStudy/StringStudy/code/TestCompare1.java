package src.MyJaveStudy.BasicStudy.StringStudy.code;
//字符串比较
public class TestCompare1 {
    public static void main(String[] args) {
        String str1 = "abc" + "xyz";
        //String str2 = getValue();
        String str3 = "abc" + "xyz";
        String str4 = "abcxyz";
        String str5 = "ab"+"cxy"+"z";
        final String s0 = "abc";
        String s1 = s0 + "xyz";
        String s2 = s0 + "xyz";
        String s3 = getValue() + "xyz";
        //System.out.println(str1 == str2);//true,常量池对象
        System.out.println(str1 == str3);//true,常量池对象，而且拼接字符串在比较时会直接拼接后再比较
        System.out.println(str1 == str4);//true
        System.out.println(str1 == str5);//true
        System.out.println(str1 == (s1 + s2));//false,因为s1+s2会被重新计算一次儿不是简单的直接字符串相加，他俩是被new之后再计算
        System.out.println(s1 == s2);//false,原理同上，但是如果s0被加上final关键字的话结果会返回true，因为final之后不会被重新new
        System.out.println(s1 == s3);//false,原理还是一样，因为方法的返回值会被new一次，会新建一次
        /**
         * 总结：但凡是要new一次的操作都会使结果发生变化
         * */
    }

    private static String getValue() {
        return "abc";
    }
}

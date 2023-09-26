package src.MyJaveStudy.BasicStudy.StringStudy.code;
@SuppressWarnings({"all"})
public class TestCompare2 {
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "make";
        String s4 = "Make";
        String s2 = "made";
        String s3 = "ma";
        boolean flag = s.equals(new String("abcde"));
        boolean flag1 = s.equals(new String("Abcde"));
        boolean flag2 = s.equals(new StringBuffer("abcde"));
        boolean flag3 = s.equals(new StringBuffer("abcde").toString());
        boolean flag4 = s.contentEquals(new StringBuffer("abcde"));
        boolean flag5 = s.equalsIgnoreCase(new String("aBcDe"));
        boolean flag6 = s4.startsWith("Ma");
        boolean flag7 = s4.endsWith("ke");
        boolean flag8 = s4.startsWith("a",1);
        int dif = s1.compareTo(s2);
        int dif1 = s2.compareTo(s3);
        int dif2 = s4.compareTo(s1);
        int dif3 = s4.compareToIgnoreCase(s1);
        System.out.println(flag);//true
        System.out.println(flag1);//false
        System.out.println(flag2);//false:参数不一样了变成StringBuffer了，转成toString之后可以比较成功
        System.out.println(flag3);//true
        System.out.println(flag4);//true:contentEquals，这个方法不能接受空作为参数，但是equals可以
        System.out.println(flag5);//true:equalsIgnoreCase 这个方法可以忽略大小写进行比较
        System.out.println("abcde".equals(s));//true,常量应该写在前面，如果参数写在前面可能会出现空指针异常
        System.out.println(dif);//7,compareTo主要用来计算两个字符串的第一对有差异的字符的编码的差值
        System.out.println(dif1);//2,返回的字符长度的差值，compareTo的用法：字符排列的顺序，只对拼音字符有效，汉字无效
        System.out.println(dif2);//-32,
        System.out.println(dif3);//0,忽略大小写比较
        System.out.println(flag6);//true,startsWith会从头开始遍历，如果没有一样的符号就直接出方法结束然后返回
        System.out.println(flag7);//true，endsWith会从结尾开始遍历，如果没有一样的符号就直接出方法结束然后返回
        System.out.println(flag8);//true,startsWith也可以去找某个下标的符号是不是那个参数，通常下标写在后面
    }
}

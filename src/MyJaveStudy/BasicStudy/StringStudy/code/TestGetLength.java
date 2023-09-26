package src.MyJaveStudy.BasicStudy.StringStudy.code;
@SuppressWarnings({"all"})
public class TestGetLength {
    public static void main(String[] args) {
        String str = "abcde";
        String str1 = "";
        int length = str.length();
        int length1 = str1.length();
        boolean flag = str1.isEmpty();
        boolean flag1 = "".equals(str1);
        System.out.println(length);
        System.out.println(length1);
        System.out.println(flag);
        System.out.println(flag1);
    }
}

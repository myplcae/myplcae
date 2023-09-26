package src.MyJaveStudy.BasicStudy.StringStudy.code;
//@SuppressWarnings({"all"})
public class TestAmount {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2);//true
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str4);//false
    }

}

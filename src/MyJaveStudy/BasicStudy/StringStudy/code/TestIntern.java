package src.MyJaveStudy.BasicStudy.StringStudy.code;
@SuppressWarnings({"all"})
public class TestIntern {
    public static void main(String[] args) {
        String s = new String("abc").intern();
        String s1 = new String("he");
        System.out.println(s == "abc");//true
        System.out.println(s1.intern() + "llo" == "hello");//false,因为等号左边用加号拼接的话会new一次不会当时就确定
        System.out.println((s1.intern() + "llo").intern() == "hello");//true,s1.intern() + "llo" 相加之后 没有被确定但是整体调用了intern方法后变成了确定值hello因此可以==
    }
}

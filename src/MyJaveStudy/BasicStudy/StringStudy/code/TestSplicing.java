package src.MyJaveStudy.BasicStudy.StringStudy.code;
//字符串拼接
@SuppressWarnings({"all"})
public class TestSplicing {
    public TestSplicing(){

    }
    public static void main(String[] args) {
//        String s1 = "abc" + "xyz";
//        String str = "ab";
//        String s2 = str + "cxyz";
        //添加过程的编译代码，实际上添加过程都会调用StringBuilder()的append去添加再toString转化
        String str = "ABC";
        String s1 = (new StringBuilder()).append(str).append("def").toString();//调用append方法之后需要重新toString
        String s2 = (new StringBuilder()).append(getValue()).append("def").append("ghi").toString();
        String s3 = (new StringBuilder()).append(new String("abc")).append("def").toString();
        String s4 = (new StringBuilder()).append("def").append(str).toString();
        String s5 = (new StringBuilder()).append("defghi").append(getValue()).toString();
        String s6 = (new StringBuilder()).append("def").append(new String("abc")).toString();
        /**
         * toString源码：可见它是把需要转成string的值new成了一个新的String
         * @Override
         *     public String toString() {
         *         // Create a copy, don't share the array
         *         return new String(value, 0, count);
         *     }
         * */
    }
    public static String getValue(){
        return "abc";
    }
}

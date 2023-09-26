package src.MyJaveStudy.BasicStudy.StringStudy.code;

public class TestReplaceStr {
    public static void main(String[] args) {
        String s = "hello world";
        String s1 = "hello. world.";
        String result = s.replaceFirst("o","-");
        String result1 = s1.replaceFirst("\\.","-");
        String result2 = s1.replaceAll("\\.","-");
        String result3 = s1.replace(".","-");
        String result4 = s1.replace(".",new StringBuffer("-"));
        String result5 = s1.replace('.','-');
        System.out.println(result);//hell- world,替换指定字符，只会替换一次索引位置最小的字符
        System.out.println(result1);//hello- world.,替换第一个.为-
        System.out.println(result2);//hello- world-,替换所有的.为-
        System.out.println(result3);//hello- world- ,不把元素当作正则而是当作字符因此会替换所有的.为-
        System.out.println(result4);//从源码里可以看见类型是CharSequence，因此可以转换StringBuffer类型
        System.out.println(result5);//hello- world-,用字符也可以替换
    }
}

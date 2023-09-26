package src.MyJaveStudy.BasicStudy.StringStudy.code;
/**
 * contains
 * */
@SuppressWarnings({"all"})
public class TestStrSearch {
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "abcdeabcde";
        int index = s.indexOf("bcd");
        int index1 = s.indexOf("aba");
        int index2 = s1.indexOf("bcd");
        int index3= s1.indexOf("bcd",5);
        int index4= s1.lastIndexOf("bcd",5);
        System.out.println(index);//1,indexof方法返回的是被搜索的值的第一个字符的下标
        System.out.println(index1);//-1,因为被搜索的字符串不在待搜索的字符串中
        System.out.println(index2);//1,如果被搜索的字符串出现了多次的话只会返回第一次出现的位置
        System.out.println(index3);//6,如果添加了指定起始位置则会从指定位置开始搜
        System.out.println(index4);//1,lastIndexOf搜的时候会从末尾位置开始搜索
    }
}

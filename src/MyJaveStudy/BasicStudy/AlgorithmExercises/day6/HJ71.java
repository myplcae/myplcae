package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * 在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
 * 要求：*：匹配0个或以上的字符（注：能被*和?匹配的字符仅由英文字母和数字0到9组成，下同）
 *      ？：匹配1个字符
 * 例：输入：te?t*.*
*          txt12.xls
*     输出：false
 * */
public class HJ71 {
    public static void main(String[] args) throws IOException {
        //这样写有问题，转化不了
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();//定义输入的字符串
//        while (in.hasNext()){
//            String target = in.nextLine();
//            //转大小写
//            str = str.toLowerCase(Locale.ROOT);
//            target = target.toLowerCase(Locale.ROOT);
//            String regx = str.replaceAll("\\*{2,}","\\*");
//            regx = regx.replaceAll("\\?","[0-9a-z]{1}");
//            regx = regx.replaceAll("\\*","[0-9a-z]{0,}");
//            System.out.println(target.matches(regx));
//        }
       //BufferedReader试一试
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String value;//定义符号位置
        while ((value = bf.readLine()) != null){
            String target = bf.readLine();
            //转大小写
            value = value.toLowerCase(Locale.ROOT);
            target = target.toLowerCase(Locale.ROOT);
            //定义转化字符的方式
            String regx = value.replaceAll("\\*{2,}","\\*");
            regx = regx.replaceAll("\\?","[0-9a-z]{1}");
            regx = regx.replaceAll("\\*","[0-9a-z]{0,}");
            System.out.println(target.matches(regx));
        }
    }
}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day4;

import java.util.Scanner;

/**
 * 描述：一个 DNA 序列由 A/C/G/T 四个字母的排列组合组成
 * */
public class HJ63 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();//输入的字符串
        int len = in.nextInt();//接收的长度
        //截取的最后的字符串
        String firstStr = str.substring(0, len);
        //窗口中GC的个数
        int count = 0;
        //GC序列的第一个位置
        int index = 0;
        //最长的GC子串
        int maxCount = 0;
        for (int i = 0; i < firstStr.length(); i++) {
            //给个临时变量
            char c = firstStr.charAt(i);
            if (c == 'G' || c == 'C') {
                count++;
            }
        }
        maxCount = count;
        //窗口滑动
        for (int i = 1; i < str.length() - len + 1; i++) {
            //窗口滑动钱的第一个字符
            if ((str.charAt(i - 1) == 'G') || (str.charAt(i - 1) == 'C')) {
                count--;
            }
            //滑动窗口后的最后一个字符
            if (str.charAt(i + len - 1) == 'G' || str.charAt(i + len - 1) == 'C') {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        System.out.println(str.substring(index,index + len));
    }

//    private static String getGC(String a, int b) {
//        //先定义一些需要的参数
//        int maxnumber = 0;//GC字母数
//        int start = 0;//初始位置
//        //开始遍历输入的字符串来定位
//        for (int i = 0; i < a.length(); i++) {
//            int number = 0;
//            for (int j = 0; j < i+b; j++) {
//                //判断GC
//                if (a.charAt(j) == 'C' || a.charAt(j) ==  'G'){
//                    number++;
//                }
//            }
//            if (number <maxnumber){
//                start = i;
//                maxnumber = number;
//                //获取最后的字符串
//                if (number == b){
//                    return a.substring(start,start+b);
//                }
//            }
//        }
//        return a.substring(start,start+b);
//    }
    //public static void main(String[] args) {
    //        Scanner in = new Scanner(System.in);
    //        // 注意 hasNext 和 hasNextLine 的区别
    //        while (in.hasNext()) { // 注意 while 处理多个 case
    //            String x= in.nextLine();
    //            int a = in.nextInt();
    //            int max = 0;
    //            int right = 0;
    //            //1.从右往左，固定长度进行循环
    //            for(int i = x.length()-1;i-a >=-1;i--){
    //              char[] ch = x.substring(i-a+1,i+1).toCharArray();
    //              //2.统计'C'和'G'出现的次数
    //              int count = 0;
    //              for(char c:ch){
    //                if(c=='C' || c=='G'){
    //                  count = count+1;
    //                }
    //              }
    //              //3.维护right坐标
    //              //4.若count超过已存储的max的值，则存入max里，更新right
    //              if(count >=max){
    //                max = count;
    //                right = i;
    //              }
    //              //5.若count不超过max则right不变
    //              else{
    //                right = right;
    //              }
    //            }
    //            System.out.println(x.substring(right-a+1,right+1));
    //        }
    //    }
}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.Scanner;

/**
 * 描述：加密方法为：当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 *      当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；其他字符不做变化。解密方法为加密的逆过程。
 * 输入：第一行输入一串要加密的密码；第二行输入一串加过密的密码
 * 输出：第一行输出加密后的字符；第二行输出解密后的字符
 * */
@SuppressWarnings({"all"})
public class HJ29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //加密字符串
        String encryptstr = in.nextLine();
        //解密字符串
        String decryptstr = in.nextLine();

        //输出加密字符串
        System.out.println(encrypt(encryptstr));
        //输出解密字符串
        System.out.println(decrypt(decryptstr));
    }
    //加密方法
    public static String  encrypt(String encryptstr){
        //定义StringBuilder传参
        StringBuilder sb = new StringBuilder();
        //转成char数组
        char[] chars = encryptstr.toCharArray();
        //for循环操作每个字符
        for(char ch: chars){
            //临时变量去替换转化关键字符
            char temp = ch;
            //数字
            if('0' <= ch && ch <= '9'){
                //判断是不是9
                if(ch == '9'){
                    temp = '0';
                }else{
                    temp = (char)(ch + 1);
                }
            }
            //大写
            if('A' <= ch && ch <= 'Z'){
                //如果是大写字母则应该先转小写
                temp = Character.toLowerCase(ch);
                //判断是不是Z
                if(temp == 'z'){
                    temp = 'a';
                }else{
                    temp = (char)(temp + 1);
                }
            }
            //小写
            if('a' <= ch && ch <= 'z'){
                //如果是小写字母则应该先转大写
                temp = Character.toUpperCase(ch);
                //判断是不是Z
                if(temp == 'Z'){
                    temp = 'A';
                }else{
                    temp = (char)(temp + 1);
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
    //解密方法
    public static String  decrypt(String decryptstr){
        //定义StringBuilder传参
        StringBuilder sb = new StringBuilder();
        //转成char数组
        char[] chars = decryptstr.toCharArray();
        //for循环操作每个字符
        for(char ch: chars){
            //临时变量去替换转化关键字符
            char temp = ch;
            //数字
            if('0' <= ch && ch <= '9'){
                //判断是不是9
                if(ch == '0'){
                    temp = '9';
                }else{
                    temp = (char)(ch - 1);
                }
            }
            //大写
            if('A' <= ch && ch <= 'Z'){
                //如果是大写字母则应该先转小写
                temp = Character.toLowerCase(ch);
                //判断是不是Z
                if(temp == 'a'){
                    temp = 'z';
                }else{
                    temp = (char)(temp -1);
                }
            }
            //小写
            if('a' <= ch && ch <= 'z'){
                //如果是小写字母则应该先转大写
                temp = Character.toUpperCase(ch);
                //判断是不是Z
                if(temp == 'A'){
                    temp = 'Z';
                }else{
                    temp = (char)(temp - 1);
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}

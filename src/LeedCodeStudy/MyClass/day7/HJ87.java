package src.LeedCodeStudy.MyClass.day7;

import java.util.Scanner;

/**
 * 密码强度等级:密码长度,最后的评分标准:
 * 1 <= 字符串的长度<= 300
 * 输入：输入一个string的密码
 * 输出：输出密码等级
 * */
public class HJ87 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNextLine()){
            char[] c = in.nextLine().toCharArray();//转字符串去取每个位置的数并判断是哪种类型的字符
            //定义初始分数为0
            int score = 0;
            //定义字符串长度
            int length = c.length;
            //长度打分
            if (length <= 4)//小于等于4 个字符加5分
                    score += 5;
            else if (length < 8)// 5 到7 字符加10分
                    score += 10;
            else//大于等于8 个字符加25分
                    score += 25;
            //通过遍历获取各种类型字符个数，先定义初始个数
            int upchar = 0;
            int lowchar = 0;
            int numchar = 0;
            int charnum = 0;
            for (char value : c) {
                if (Character.isUpperCase(value))
                    ++upchar;
                else if (Character.isLowerCase(value))
                    ++lowchar;
                else if (Character.isDigit(value))
                    ++numchar;
                else
                    ++charnum;
            }
            //字母分数
            if((upchar > 0 && lowchar ==0) || (upchar == 0 && lowchar > 0))
                score += 10;
            else if(upchar > 0 && lowchar > 0)
                score += 20;
            //数字分数
            if(numchar == 1)
                score += 10;
            else if(numchar > 1)
                score += 20;
            //符号分数
            if(charnum ==1)
                score += 10;
            else if(charnum > 1)
                score += 25;
            //奖励分数
            if(numchar >0 && upchar >0 && lowchar > 0 && charnum > 0)
                score += 5;
            else if(numchar > 0 && charnum > 0 &&(upchar >0 || lowchar >0))
                score += 3;
            else if(numchar > 0 && (upchar >0 || lowchar > 0))
                score += 2;
            //打分
            if(score >= 90)
                System.out.println("VERY_SECURE");
            else if(score >= 80)
                System.out.println("SECURE");
            else if(score >=70)
                System.out.println("VERY_STRONG");
            else if(score >= 60)
                System.out.println("STRONG");
            else if(score >= 50)
                System.out.println("AVERAGE");
            else if(score >=25)
                System.out.println("WEAK");
            else
                System.out.println("VERY_WEAK");
        }
    }
}

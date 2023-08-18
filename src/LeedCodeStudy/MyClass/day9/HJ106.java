package src.LeedCodeStudy.MyClass.day9;

import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。
 * */
public class HJ106 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        }
    }
}

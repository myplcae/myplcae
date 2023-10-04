package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *输入；两个字符串
 * 描述：从字符串2中找出所有字符串1中的字符，并排序
 * */
public class Test10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        //新建两个hashSet装载两个字符串
        HashSet<Character> set1 = new HashSet<>();
        for (Character c : str1.toCharArray())
            set1.add(c);
        HashSet<Character> set2 = new HashSet<>();
        for (Character c : str2.toCharArray())
            set2.add(c);
        //定义一个字符集去查看字符串2是否有字符串1中的字符，如果有则装进stringbuild，再输出结果
            Character[] characters = set1.stream().filter(set2::contains).toArray(Character[]::new);
        Arrays.sort(characters);
        //定义StringBuilder
        StringBuilder sb = new StringBuilder();
        for (Character character : characters)
            sb.append(character);
        System.out.println(sb.toString());

    }
}

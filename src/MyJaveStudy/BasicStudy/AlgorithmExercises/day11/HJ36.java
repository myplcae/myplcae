package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.*;

/**
 * 有一种技巧可以对数据进行加密，它使用一个单词作为它的密匙。下面是它的工作原理：首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，
 * 将所得结果作为新字母表开头，并将新建立的字母表中未出现的字母按照正常字母表顺序加入新字母表。如下所示：
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 *  (实际需建立小写字母的字母表，此字母表仅为方便演示）
 * 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。
 * 因此，使用这个密匙， Attack AT DAWN (黎明时攻击)就会被加密为Tpptad TP ITVH。
 * 请实现下述接口，通过指定的密匙和明文得到密文。
 * 输入：先输入key和要加密的字符串
 * 输出：返回加密后的字符串
 * */
public class HJ36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入key
        String key = in.nextLine();
        //输入要加密的字符串
        String str = in.nextLine();
        //参数存入list
        List<Character> chars = new ArrayList<>();
        List<Character> chars1 = new ArrayList<>();
        //遍历list
        for (int i = 0; i < key.length(); i++) {
            if (!chars.contains(key.charAt(i))){
                chars.add(key.charAt(i));
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {//问题1:
            if (!chars.contains((char)i)){
                chars.add((char) i);
            }
            chars1.add((char)i);
        }
        Map<Character,Character> map = new HashMap<>();
        for (int i = 0; i < chars1.size(); i++) {
            map.put(chars1.get(i),chars.get(i));
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            sb.append(map.get(str.charAt(i)));
        }
        System.out.println(sb.toString());
    }
}

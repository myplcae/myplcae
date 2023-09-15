package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.*;

/**
 * 给出一个字符串，该字符串仅由小写字母组成，定义这个字符串的“漂亮度”是其所有字母“漂亮度”的总和。
 * 每个字母都有一个“漂亮度”，范围在1到26之间。没有任何两个不同字母拥有相同的“漂亮度”。字母忽略大小写。
 * 给出多个字符串，计算每个字符串最大可能的“漂亮度”。
 * 输入：第一行一个整数N，接下来N行每行一个字符串
 * 输出：每个字符串可能的最大漂亮程度
 * */
public class HJ45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //字符串的个数
        int num = in.nextInt();
        //存入list
        List<String> list = new ArrayList<>();
        //遍历
        for (int i = 0; i < num; i++) {
            list.add(in.next());//存入
        }
        for (String str : list) {
            System.out.println(getmaxbecutiful(str));
        }

    }
    //得到最大漂亮度的方法
    public static int getmaxbecutiful(String str){
        //字符串拆成字符
        char[] chars = str.toCharArray();
        //新建map去存输入的字母，key存是哪个字母，value存出现次数，因此用hashmap去存
        Map<Character,Integer> map = new HashMap<>();
        //判断并添加漂亮度和字母到map里
        for (char c : chars) {
            if (map.get(c) == null){
                map.put(c,1);
            }else {
                int count = map.get(c);//如果有一个有效值则定义出现次数
                map.put(c,count + 1);
            }
        }
        //初始化一个list去遍历字母出现的次数并且计算漂亮度
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            list.add(entry.getValue());//获取漂亮度
        }
        //用collections排序计算
        Collections.sort(list);

        Collections.reverse(list);
        //累加排序
        int temp = 0;
        int count = 26;
        for (Integer num : list) {
            temp += num * (count--);
        }

        return temp;
    }
}

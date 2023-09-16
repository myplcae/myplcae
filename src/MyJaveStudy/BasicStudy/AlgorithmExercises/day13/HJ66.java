package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 配置文件恢复
 * 思路：使用keySet实现
 * */
public class HJ66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //定义一个哈希表用来装题目的参数
        Map<String, String> map = new HashMap<String, String>();
        map.put("reset", "reset what");
        map.put("reset board", "board fault");
        map.put("board add", "where to add");
        map.put("board delete", "no board at all");
        map.put("reboot backplane", "impossible");
        map.put("backplane abort", "install first");
        //需要输出多个
        while (in.hasNext()) {
            String key = in.nextLine().trim();
            String[] value = key.split("\\ +");//分割空格
            String pattern = "";//临时变量
            //遍历去匹配
            for (int i = 0; i < value.length - 1; i++)
                pattern = pattern.concat(value[i] + "[a-z]*\\ +");//匹配关键字和空格
            //匹配关键字不带空格
            pattern = pattern.concat(value[value.length - 1] + "[a-z]*");
            //定义非法输入的返回值	unknown command
            String output = "unknown command";
            //定义参数是否合法
            boolean flag = true;//初始参数设为true
            //然后使用entryset去匹配
            for (Map.Entry<String, String> e : map.entrySet()) {
                if (e.getKey().matches(pattern)) {//是合法字母才进去匹配
                    if (flag) {
                        output = e.getValue();//输出对应的value
                        flag = false;//刷新初始变量参数
                    } else {
                        output = "unknown command";
                        break;
                    }
                }
            }
            System.out.println(output);
        }
    }
}

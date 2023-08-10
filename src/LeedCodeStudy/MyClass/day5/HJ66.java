package src.LeedCodeStudy.MyClass.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 根据命令执行结果（具体见案例）
 *
 * */
public class HJ66 {
    public static void main(String[] args) {
        //创建一个用来存钥匙的数组
        Map<String,String> map = new HashMap<>();
        map.put("reset", "reset what");
        map.put("reset board", "board fault");
        map.put("board add", "where to add");
        map.put("board delete", "no board at all");
        map.put("reboot backplane", "impossible");
        map.put("backplane abort", "install first");
        //输入
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            String cmd = in.nextLine().trim();//去空
            //按空格分割
            String[] cmds = cmd.split("\\ +");
            String pattern = "";
            //遍历
            for (int i = 0; i < cmds.length-1; i++)
                //正则匹配字符
                pattern = pattern.concat(cmds[i] + "[a-z]*\\ +");
            pattern = pattern.concat(cmds[cmds.length - 1] + "[a-z]*");
            String output = "unknow command";
            //记录是否匹配到多个
            boolean flag = true;
            //遍历命令集合
            for(Map.Entry<String,String> c: map.entrySet()){
                if (c.getKey().matches(pattern)){
                    if (flag){
                        output = c.getValue();
                        flag = false;
                    }else {
                        output = "unknown command";
                        break;
                    }
                }
            }
            System.out.println(output);
        }
    }
}

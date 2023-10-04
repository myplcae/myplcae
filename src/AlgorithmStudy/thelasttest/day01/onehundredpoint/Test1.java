package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 加密字符串，使特定位置的字符加密
 * */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index=Integer.parseInt(in.nextLine());
        String str = in.nextLine();
        LinkedList<String> cmdList = new LinkedList<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == '_' && ())
//        }
        StringBuilder cmd = new StringBuilder();
        char[] chArr=str.toCharArray();
        for(int i=0;i<chArr.length;i++){
            char item=chArr[i];
            if(item=='"'&& cmd.toString().contains(String.valueOf(item))){
                //如果是双引号 且该命令字内有 那么就是结束的双引号
                cmd.append("\"");
                cmdList.add(cmd.toString());
                cmd = new StringBuilder();
            }else if(item=='_'&&!cmd.toString().contains("\"")){
                //item=='_' 下划线 表示指令结束
                //!cmd.contains("\"") 该命令内前面不包含" 若包含 则是引号内的 为同一个命令字
                //cmd.equals("") 该命令字内是空的 那么就是空下划线 无意义 过滤掉
                if(!cmd.toString().equals("")){
                    cmdList.add(cmd.toString());
                    cmd = new StringBuilder();
                }
            }
            else if(i==chArr.length-1){
                //如果是最后一位 则直接结束最后一个命令字
                cmd.append(item);
                cmdList.add(cmd.toString());
                cmd = new StringBuilder();
            }
            else{
                //其他 情况 则是命令字
                cmd.append(item);
            }
        }
        if (index > cmdList.size()-1||index<0){
            System.out.println("ERROR");
        }else {
            cmdList.set(index,"******");
            StringBuilder result = new StringBuilder();
            for (String item : cmdList) {
                result.append("_").append(item);
            }
            result = new StringBuilder(result.toString().replaceFirst("_", ""));
            System.out.println(result);
        }
    }
}

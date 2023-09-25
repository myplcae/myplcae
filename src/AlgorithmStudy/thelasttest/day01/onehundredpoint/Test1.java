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
        String cmd = "";
        char[] chArr=str.toCharArray();
        for(int i=0;i<chArr.length;i++){
            char item=chArr[i];
            if(item=='"'&&cmd.contains(item+"")){
                //如果是双引号 且该命令字内有 那么就是结束的双引号
                cmd+="\"";
                cmdList.add(cmd);
                cmd="";
            }else if(item=='_'&&!cmd.contains("\"")){
                //item=='_' 下划线 表示指令结束
                //!cmd.contains("\"") 该命令内前面不包含" 若包含 则是引号内的 为同一个命令字
                //cmd.equals("") 该命令字内是空的 那么就是空下划线 无意义 过滤掉
                if(!cmd.equals("")){
                    cmdList.add(cmd);
                    cmd="";
                }
            }
            else if(i==chArr.length-1){
                //如果是最后一位 则直接结束最后一个命令字
                cmd+=item;
                cmdList.add(cmd);
                cmd="";
            }
            else{
                //其他 情况 则是命令字
                cmd+=item;
            }
        }
        if (index > cmdList.size()-1||index<0){
            System.out.println("ERROR");
        }else {
            cmdList.set(index,"******");
            String result = "";
            for (String item : cmdList) {
                result += "_" + item;
            }
            result = result.replaceFirst("_","");
            System.out.println(result);
        }
    }
}

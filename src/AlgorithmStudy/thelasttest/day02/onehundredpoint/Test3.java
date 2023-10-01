package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Scanner;

/**
 * 描述：判断员工能否获得出勤奖，
 * 出勤信息：absent：缺勤；late：迟到；leaveearyly:早退；present：正常上班
 * 判断员工能不能拿奖：缺勤不超过一次，没有连续的迟到早退，连续任意7次考勤，缺勤迟到早退不超过3次；
 * 输入：考勤字符串，记录条数，
 * */
public class Test3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        String[][] str = new String[a][];
        for (int i = 0; i < a; i++) {
            str[i] = in.nextLine().split(" ");
        }
        getattendance(a,str);
    }

    private static void getattendance(int a, String[][] str) {
        for (int i = 0; i < a; i++) {
            System.out.println(isfull(str[i]));
        }
    }

    private static boolean isfull(String[] strings) {
        int absent = 0,present = 0;
        String pre = "";
        for (int i = 0; i < strings.length; i++) {
            String cur = strings[i];//记录考勤
            switch (cur){
                case "absent":
                    if (++absent > 1)
                    return false;
                    break;
                case "late":
                case "leaveearyly":
                    if ("late".equals(pre) || "leaveearyly".equals(pre))
                        return false;
                        break;
                case "present":
                    present++;
            }
            pre = cur;
            //连续出现七次，可以看成滑窗，
            if (i >= 6){
                //内部滑窗次数少于4次则迟到，
                if (present < 4)
                    return false;
                if ("present".equals(strings[i-6])){
                    present--;
                }
            }
        }
        return true;
    }
}

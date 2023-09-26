package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 输入描述：13张任意顺序的扑克牌，每张扑克牌用空格隔开，不考虑异常情况
 * 输出描述：组成的顺子
 * */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] cards = in.nextLine().split(" ");
        getStraight(cards);
    }

    private static void getStraight(String[] cards) {
        //扑克牌总数
        int nums = cards.length;
        //每张牌的数量
        int[] count = new int[15];
        for (String card : cards) {
            int num = mapToNum(card);
            count[num]++;
        }
        //记录顺子，顺子表示为数组，数组含义（起始牌，结束牌）
        ArrayList<int[]> straights = new ArrayList<>();

        for (int i = 3; i <=10 ; i++) {
            //五张顺子
            if (isStright(count,i,i+4)){
                //如果可以组成5张顺子就记录这个顺子
                straights.add(new int[]{i,i+4});
                //总牌数-5
                nums -= 5;
                //对应牌的数量-1
                for (int j = 0; j <= i+4; j++)
                    count[j]--;
            }
        }
        //如果顺子拿完后还有牌
        if (nums > 0){
            //尝试加到5张的顺子后面
            for (int[] straight : straights){
                for (int i = 3; i <= 14; i++) {
                    if (count[i] > 0 && i-straight[1] == 1){
                        straight[1] = i;
                        count[i]--;
                    }
                }
            }
        }
        //如果没有顺子
        if (straights.size() == 0){
            System.out.println("No");
            return;
        }
        //如果有顺子就输出顺子
        for (int[] straigth :straights) {
            int start = straigth[0];
            int end = straigth[1];
            StringJoiner sj = new StringJoiner(" ");
            for (int i = start;i<=end;i++)
                sj.add(mapToCard(i));
            System.out.println(sj);
        }

    }

    private static boolean isStright(int[] count, int start, int end) {
        int i = start;
        for (;i<=end;i++){
            if (count[i] == 0)
                break;
        }
        return i > end;
    }
    public static int mapToNum(String card){
        switch (card){
            case "J":return 11;
            case "Q":return 12;
            case "K":return 13;
            case "A":return 14;
            default:return Integer.parseInt(card);
        }
    }
    public static String mapToCard(int num){
        switch (num){
            case 11:return "J";
            case 12:return "Q";
            case 13:return "K";
            case 14:return "A";
            default:return num + "";
        }
    }
}

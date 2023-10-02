package src.AlgorithmStudy.thelasttest.day02.twohundredpoint;

import java.util.Scanner;

/**
 * 转骰子：一个骰子，L、R、F、B、A、C代表旋转方向
 * 输入：输入一行代表旋转方向的参数
 * 输出：骰子的最后状态
 * */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        turnDice(arr);
    }

    private static void turnDice(String[] arr) {
        Dice dice = new Dice();
        for (String arrs : arr) {
            switch (arrs){
                case "L":dice.turnL();
                break;
                case "R":dice.turnR();
                break;
                case "F":dice.turnF();
                break;
                case "B":dice.turnB();;
                break;
                case "A":dice.turnA();
                break;
                case "C":dice.turnC();
                break;
            }
        }
        dice.print();
    }
}
class Dice{
    int left = 1;//左
    int right = 2;//右
    int front = 3;//前
    int back = 4;//后
    int top = 5;//上
    int bottom = 6;//下
    //前后不变，上变左，左变下，下变右，右变上
    public void turnL(){
        int tmp = this.right;
        this.right = this.bottom;
        this.bottom = this.left;
        this.left = this.top;
        this.top = tmp;
    }
    //前后不变，上变右，右变下，下变左，左变上
    public void turnR() {
        int tmp = this.left;
        this.left = this.bottom;
        this.bottom = this.right;
        this.right = this.top;
        this.top = tmp;
    }
    //左右不变，上变前，前变下，下变后，后变上
    public void turnF() {
        int tmp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.bottom;
        this.bottom = tmp;
    }
    //左右不变，前变上，上变后，后变下，下变前
    public void turnB(){
        int tmp = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.back;
        this.back = tmp;
    }
    //上下不变，前变右，右变后，后变左，左变前
    public void turnA() {
        int tmp = this.right;
        this.right = this.front;
        this.front = this.left;
        this.left = this.back;
        this.back = tmp;
    }
    //上下不变，右变前，前变左，左变后，后变右
    public void turnC() {
        int tmp = this.front;
        this.front = this.right;
        this.right = this.back;
        this.back = this.left;
        this.left = tmp;
    }

    public void print() {
        String sb = String.valueOf(this.left) + this.right + this.front + this.back + this.top + this.bottom;
        System.out.println(sb);
    }
}

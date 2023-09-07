package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day7;

import java.util.Scanner;

/**
 * 有一个m*n的数据表，你会进行以下5种操作：
 * 1、输入m、n,初始化m*n大小的表格
 * 2、输入x1、y1、x2、y2,交换坐标在（x1,y1）和（x2,y2）的两个数
 * 3、输入x,在x行上方添加一行
 * 4、输入y，在y列左边添加一列
 * 5、输入x、y,查找坐标为（x,y）的单元格的值
 * 编写程序，判断对表格的各种操作是否合法
 * 要求：1、数据表的最大规格为9行*9列，对表格进行操作时遇到超出规格应该返回错误。
 *      2、对于插入操作，如果插入后行数或列数超过9了则应返回错误。如果插入成功了则将数据表恢复至初始化的m*n大小，多出的数据则应舍弃。
 *      3、所有输入坐标操作，对m*n大小的表格，行号坐标只允许0~m-1,列好坐标只允许0~n-1.超出范围应该返回错误
 *      数据范围：1《=t<=5
 * 输入描述：1 表格的行列值；2 要交换的两个单元格的行列值；3 输入要插入的行的数值；4 输入要插入的列的数值；5 输入要查询的单元格的坐标
 * 输出描述：1 初始化表格是否成功，若成功则返回0， 否则返回-1；2 输出交换单元格是否成功；3 输出插入行是否成功；4 输出插入列是否成功；5 输出查询单元格数据是否成功
 * */
public class HJ83 {
    public static void main(String[] args) {
        //开始输入
        Scanner in = new Scanner(System.in);
        //定义所需参数
        int r,c,r1,c1,r2,c2,ri,ci,rt,ct;
        while (in.hasNext()){
            r = in.nextInt();
            c = in.nextInt();
            r1 = in.nextInt();
            c1 = in.nextInt();
            r2 = in.nextInt();
            c2 = in.nextInt();
            ri = in.nextInt();
            ci = in.nextInt();
            rt = in.nextInt();
            ct = in.nextInt();
            //判断输入的矩阵是不是9*9的行列式
            if (r<=9 && c<=9){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
            //插入操作输入的数字应当小于矩阵的函数和列数
            if ((r1 < r && r2 < r) && (c1 < c2 && c2 < c)){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
            //插入行和列的时候应当在原来的行列数小于9的情况下
            if (ri < r && r < 9){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
            if (ci < c && c < 9){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
            //无论怎么操作，结果的矩阵应当跟初始矩阵大小一样
            if (rt < r && ct < c){
                System.out.println(0);
            }else {
                System.out.println(-1);
            }
        }
        in.close();
    }
}

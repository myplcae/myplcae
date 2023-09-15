package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.Scanner;

/**
 * 输入一个单向链表和一个节点的值，从单向链表中删除等于该值的节点，删除后如果链表中无节点则返回空指针。
 * 链表的值不能重复。
 *
 * */
public class HJ48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入几点的个数
        int nums = in.nextInt();
        //输入头结点的值
        int headvalue = in.nextInt();
        //初始化链表
        Thelinkedlist linkedlist = new Thelinkedlist();
        //初始化头结点
        Node root = new Node();
        root.value = headvalue;
        linkedlist.root = root;
        //加节点
        for (int i = 0; i < nums - 1 ; i++) {
            linkedlist.seladd(in.nextInt(),in.nextInt());
        }
        //删节点
        linkedlist.deleteNode(in.nextInt());
        //遍历
        linkedlist.bianli();
    }
}
//构造链表，用来寻址
class Thelinkedlist{
    //头节点
    Node root;
    //输出
    public void bianli(){
        if (root == null){
            return;
        }
        Node temp = root;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    //添加节点的方式,value是将要加入链表的值，falvalue是将要填充next的值
    public void seladd(int value,int falvalue){
        //先扎到要填补next的值对应的节点，如果为空直接将新节点放到节点A的next,如果不为空，则将其放到另一个next缓存，然后再放到B的next
        Node temp = root;
        while (temp.value != falvalue){
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        Node node = new Node();
        node.value = value;
        if (temp.next == null){
            temp.next = node;
        }else {
            Node nextTemp = temp.next;
            temp.next = node;
            node.next = nextTemp;
        }
    }
    //删除节点的方法,首先检查要删除的节点是不是根节点，将指定节点的值置空，否则将其赋值为next位置的值，如果不是根节点，则要查找要删节点的前一个节点然后重新指向
    public void deleteNode(int value){
        if (root.value == value){
            if (root.next == null){
                root = null;
            }else {
                root = root.next;
            }
            return;
        }
        Node temp = root;
        while (temp != null && temp.next.value != value){
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        temp.next = temp.next.next;
    }
}
//构造节点函数
class Node{
    //节点位置
    int value;
    //节点的下一个位置符号
    Node next;
}


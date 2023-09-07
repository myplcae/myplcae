package src.MyJaveStudy.BasicStudy.collection.code.list;
/**
 * 增加删除速度快
 * */
@SuppressWarnings("all")
public class LinkedList_01 {
    public static void main(String[] args) {
        Node node1 = new Node("张开国");
        Node node2 = new Node("陈明明");
        Node node3 = new Node("小范");
        //连接三个节点形成双向链表
        //正向
        node1.next = node2;
        node2.next = node3;
        //反向
        node3.pre = node2;
        node2.pre = node1;
        //定义头
        Node firstnode = node1;
        //定义尾
        Node lastnode = node3;
        //演示遍历从头到尾
        System.out.println("=========正向=========");
        while (true){
            if (firstnode == null){
                break;
            }
            System.out.println(firstnode);
            firstnode = firstnode.next;
        }
        //演示从尾到头
        System.out.println("============逆向========");
        while (true){
            if (lastnode == null){
                break;
            }
            System.out.println(lastnode);
            lastnode = lastnode.pre;
        }
        //添加一个元素
        Node node4 = new Node("小欢");
        firstnode = node1;
        node4.next = node3;
        node4.pre = node2;
        node3.pre = node4;
        node2.next = node4;
        System.out.println("========插入后正序输出==========");
        while (true){
            if (firstnode == null){
                break;
            }
            System.out.println(firstnode);
            firstnode = firstnode.next;
        }
        System.out.println("========插入后逆序输出==========");
        lastnode = node3;
        while (true){
            if (lastnode == null){
                break;
            }
            System.out.println(lastnode);
            lastnode = lastnode.pre;
        }
    }
}
class Node{
    public Object item;//真正存放数据的节点
    public Node next;//下一个节点的数据
    public Node pre;//上一个节点的数据

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Node name: " + item;
    }
}

package src.MyJaveStudy.BasicStudy.collection.code.Set;

public class HashSetStructure {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //模拟hashMap（hashSet）的底层结构

        //创建一个数组，数组的类型是Node[]
        Node[] table = new Node[16];
        System.out.println("table = " + table);
        //创建节点
        Node  john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack",null);
        john.next = jack;
        Node rose = new Node("Rose", null);
        Node luck = new Node("luck", null);
        table[3] = luck;
        System.out.println("table = " + table);


    }
}
class Node{
    //节点，存数据
    Object item;
    //指向下一个节点
    Node next;

    public Node(String john, Object o) {
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }

}
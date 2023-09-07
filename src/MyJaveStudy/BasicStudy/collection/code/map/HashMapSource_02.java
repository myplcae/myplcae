package src.MyJaveStudy.BasicStudy.collection.code.map;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class HashMapSource_02 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            hashMap.put(new UseA(i),"hello");
        }
        System.out.println("hashMap = " + hashMap);
    }
}
class UseA{
    private int num;

    public UseA(int num) {
        this.num = num;
    }
    //所有这个对象的hashCode都是100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nUseA{" +
                "num=" + num +
                '}';
    }
}

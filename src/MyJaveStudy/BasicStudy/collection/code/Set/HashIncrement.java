package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashIncrement {
    public static void main(String[] args) {
        /**
         * HashSet扩容机制实验
         * */
        HashSet hashSet = new HashSet<>();
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }
//        for (int i = 0; i <= 12; i++) {
//            hashSet.add(new A[i]);
//        }
//        System.out.println("hashSet= " +hashSet);

        for (int i = 0; i < 7; i++) {//增加7个A
            hashSet.add(new A[i]);
        }
        for (int i = 0; i < 7; i++) {//增加7个B
            hashSet.add(new B[i]);
        }
    }
}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }
        @Override
    public int hashCode() {
        return 100;
    }
}
class B{
    private int n;

    public B(int n) {
        this.n = n;
    }
    @Override
    public int hashCode() {
        return 100;
    }
}

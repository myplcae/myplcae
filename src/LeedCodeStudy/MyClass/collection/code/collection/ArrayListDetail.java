package src.LeedCodeStudy.MyClass.collection.code.collection;

import java.util.ArrayList;
import java.util.List;
/**
 * ArrayList可以加空元素，由数组实现
 *基本等同于Vector
 * 线程不安全不建议在多线程场景下使用
 * */
@SuppressWarnings("all")
public class ArrayListDetail {
    public static void main(String[] args) {
        /**
         * 源码可见没有synchronized（互斥锁）关键字修饰，因此线程不安全
         * public boolean add(E e) {
         *         ensureCapacityInternal(size + 1);  // Increments modCount!!
         *         elementData[size++] = e;
         *         return true;
         *     }
         * */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);
    }
}

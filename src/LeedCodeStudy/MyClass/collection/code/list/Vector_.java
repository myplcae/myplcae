package src.LeedCodeStudy.MyClass.collection.code.list;

import java.util.Vector;

public class Vector_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //无参构造
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println("vector=" + vector);
        /**
         * 源码：新建10个
         *  public Vector() {
         *         this(10);
         *     }
         * 新增：
         *      public synchronized boolean add(E e) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = e;
         *         return true;
         *     }
         * */
    }
}

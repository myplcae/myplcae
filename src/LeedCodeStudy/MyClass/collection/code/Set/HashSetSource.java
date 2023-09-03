package src.LeedCodeStudy.MyClass.collection.code.Set;

import java.util.HashSet;

public class HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println("set=" + hashSet);
        /**
         * 源码解读：
         * 1、public HashSet() {
         *         map = new HashMap<>();
         *     }
         * 2、执行add
         *   public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;（PRESENT是一个静态类型的占位符：static final Object PRESENT = new Object();）
         *     }
         * 3、执行put,该方法会执行hash(key),
         *    public V put(K key, V value) {key = 'JAVA',VALUE = PRESENT
         *         return putVal(hash(key), key, value, false, true);
         *     }
         * 4、执行putVal
         *    final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;  定义辅助变量
         *         if ((tab = table) == null || (n = tab.length) == 0)  如果table是空或者尺寸为0就第一次扩容，扩到16
         *             n = (tab = resize()).length;
         *         if ((p = tab[i = (n - 1) & hash]) == null)   根据key,得到hash,计算key应该存放到什么位置，并且把该位置的对象赋值给P，并且判断P是不是空
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash &&    如果当前索引位置对应的链表的第一个元素和准备添加的key的hash值一样，以及满足后面的两个条件就不能加入
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)  再判断p是不是红黑树，如果是红黑树就要调用putTreeVal
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);   这个方法是为了让hashMap的子类去实现一些相关方法留的空位
         *         return null;
         *     }
         *
         * */

    }
}

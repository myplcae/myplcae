package src.com.Designpattern.singlePattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 懒汉式：事实上本类测试的是启动十条线程，但是实际上并没有完全成功
 * 解决方式：加锁
 * */
public class LazyMan {

    private static boolean qinjian = false;
    //单线程下没问题
    private LazyMan(){
        synchronized (LazyMan.class){
//            if (null != lazyMan){
//                throw new RuntimeException("不要试图使用反射破坏异常");
//            }
            if (qinjian == false){
                qinjian = true;
            }else {
                throw new RuntimeException("不要试图使用反射破坏异常");
            }
        }
        System.out.println(Thread.currentThread().getName() + "   ok");
    }
    private volatile static LazyMan lazyMan;
    //双重检测锁模式   简称DCL懒汉式
    public static LazyMan getInstance(){
        if (null == lazyMan){
            synchronized (LazyMan.class){
                if (null == lazyMan){
                    lazyMan = new LazyMan();//不是原子性操作
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化对象
                     * 3.把对象指向空间
                     * 问题暴露：执行过程中可能会导致执行顺序间出现冲突
                     * 解决办法：在定义变量的时候加volatile关键字
                     * */
                }
            }
        }
        return lazyMan;
    }
    //测试十条线程下会不会出现问题
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            new Thread(LazyMan::getInstance).start();
//        }
//    }
    //反射
    public static void main(String[] args) throws Exception {
        Field qinjian = LazyMan.class.getDeclaredField("qinjian");
        qinjian.setAccessible(true);
        LazyMan instance = LazyMan.getInstance();
        Constructor<LazyMan> declaredConstructor = LazyMan.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);//无视私有的构造器

        qinjian.set(instance,false);

        LazyMan instance2 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance2);

    }

}

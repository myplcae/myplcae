![img.png](image/img.png)
集合框架体系图:
    ![img.png](image/img1.png)
    比较重要的几个概念：
    单列（单个值形式）：    ![img.png](image/img.png)
    双列（键值对形式）：    ![img_1.png](image/img_1.png)
    collection集合下有两个重要的子接口：list、 set，他们的实现子类都是单例子类
    Map的实现子类是双列子类，存放的是key 和value；
  
一、Collection接口和常用方法：![img_2.png](image/img_2.png)
                          ![img_3.png](image/img_3.png)
                1、迭代器的执行原理：![img_4.png](image/img_4.png)
                2、for循环增强：![img.png](image/img_5.png)
                
作业：![img_1.png](image/img_6.png):见包collection/homework;

list相关：![img_1.png](image/img_7.png)
         ![img.png](image/img_9.png)
    作业：![img.png](image/img_10.png)

作业 ：![img.png](image/img_8.png)

ArrayList:![img.png](image/img_11.png)
        ![img.png](image/img_12.png)
    扩容源码(grow)：![img.png](image/img_13.png)
                  ![img.png](image/img_14.png)  
Vector:如果需要保证线程安全的话优先使用vector
    ![img.png](image/img_15.png)
    Vector和ArrayList的比较：![img.png](image/img_16.png)
LinkedList:![img_1.png](image/img_17.png)
        底层结构：![img.png](image/img_18.png)
ArrayList和LinkedList比较：![img.png](image/img_19.png)

Set集合：![img.png](image/img_20.png)
    特点：![img.png](image/img_21.png)
    实现类HashSet：![img.png](image/img_22.png)
    相关代码：![img.png](image/img_23.png)
    HashSet作业：![img.png](image/img_24.png)
                ![img.png](image/img_25.png)
    LinkedHashSet:![img.png](image/img_26.png)
    LinkedHashSet底层机制图：![img.png](image/img_27.png)
    LinkedHashSet作业:![img.png](image/img_28.png)
Map接口：![img.png](image/img_29.png)
    特点：![img.png](image/img_30.png)
    作业：![img.png](image/img_31.png)
HashMap小结：![img.png](image/img_32.png)
    hashMao原理：![img.png](image/img_33.png)
HashTable:![img.png](image/img_34.png)
    HashMap和HashTable比较：![img.png](image/img_35.png)
Properties:![img.png](image/img_36.png)
怎么选择集合：![img.png](image/img_37.png)
Collections:![img.png](image/img_38.png)
            ![img.png](image/img_39.png)

作业小结：第一题：![img.png](image/img_40.png)
        第二题：![img.png](image/img_41.png)
//增强for不能用于遍历hashMap
        第三题：![img.png](image/img_42.png)
        第四、五题：![img.png](image/img_43.png)
        第六题：![img.png](image/img_44.png)
package src.MyJaveStudy.BasicStudy.StringStudy.code;
@SuppressWarnings({"all"})
//字符串比较
public class TestCompare {
    public static void main(String[] args) {
        //对于引用数据而言，双等号比较的是两个对象的内存地址的值是否相等
        A a1 = new A();
        A a2 = new A();
        B b1 = new B();
        Father f = new Father();
        Child c = new Child();
        System.out.println(a1 == a2);
        //System.out.println(a1 == b1);//类型不同不能比较
        System.out.println(f == c);
    }
}

class A {
}

class B {
}

class Father {
}

class Child extends Father {
}

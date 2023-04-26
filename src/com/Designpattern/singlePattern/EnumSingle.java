package src.com.Designpattern.singlePattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//枚举
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //EnumSingle instance = EnumSingle.INSTANCE;
        EnumSingle instance1 = EnumSingle.INSTANCE;

        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();

        //.NoSuchMethodException
        //System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
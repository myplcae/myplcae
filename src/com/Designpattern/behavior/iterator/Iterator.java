package src.com.Designpattern.behavior.iterator;

public interface Iterator {
    //判断容器中时候还有元素
    public abstract Boolean hasNext();

    //获取容器中的下一个元素
    public abstract Object next();
}

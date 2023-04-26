package src.com.Designpattern.structure.Flyweight;

public abstract class Charge {
    //0未使用  1使用中
    protected Integer state = 0;

    public abstract void use(Person person);

    public abstract void back();

    public Integer getState(){
        return state;
    }
}

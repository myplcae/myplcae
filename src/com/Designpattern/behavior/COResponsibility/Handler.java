package src.com.Designpattern.behavior.COResponsibility;

public abstract class Handler {

    Handler nextHandler;

    abstract void process(int leaveDays);

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
}

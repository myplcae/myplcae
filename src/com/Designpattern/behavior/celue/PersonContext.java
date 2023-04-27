package src.com.Designpattern.behavior.celue;

public class PersonContext {

    private Strategy strategy;
    //无参构造
    PersonContext(){

    }
    //有参构造
    PersonContext(Strategy strategy){
        this.strategy =strategy;
    }
    //策略
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    //开始执行策略
    public void startTravle(){
        if (null !=strategy){
            strategy.travle();
        }
    }

}

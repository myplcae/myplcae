package src.com.Designpattern.behavior.state;

public class HungryState implements State{
    @Override
    public void eat() {
        System.out.println("饥饿状态-----疯狂乱吃");
    }

    @Override
    public void play(Person person) {
        System.out.println("饥饿状态-------水平大幅度降低");
    }

    @Override
    public void work() {
        System.out.println("饥饿状态-------饿的一逼还要打工舔老板");
    }
}

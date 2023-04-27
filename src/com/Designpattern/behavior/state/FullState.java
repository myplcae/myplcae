package src.com.Designpattern.behavior.state;

public class FullState implements State{
    @Override
    public void eat() {
        System.out.println("已经饱了，还吃个灯儿");
    }

    @Override
    public void play(Person person) {
        System.out.println("我浑身有劲儿，走，出去耍");
        person.setCurrent_state(new HungryState());
    }

    @Override
    public void work() {
        System.out.println("吃饱了工作效率高的一比");
    }
}

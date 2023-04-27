package src.com.Designpattern.behavior.state;
//状态模式测试类
public class TestState {

    public static void main(String[] args) {
        Person person = new Person();
        person.setCurrent_state(new FullState());

        person.doWork();
        person.eatfood();
        person.playBall();

        person.doWork();
        person.eatfood();
    }
}

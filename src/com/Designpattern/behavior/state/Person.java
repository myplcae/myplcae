package src.com.Designpattern.behavior.state;

public class Person {
    //定义状态
    private State Hungry_state;

    private State Full_state;

    private State current_state;

    public void setCurrent_state(State state){
        current_state = state;
    }
    public void eatfood(){
        current_state.eat();
    }
    public void doWork(){
        current_state.work();
    }
    public void playBall(){
        current_state.play(this);
    }
}

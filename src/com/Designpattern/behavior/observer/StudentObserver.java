package src.com.Designpattern.behavior.observer;

public class StudentObserver implements Observer{

    @Override
    public void reponse() {
        System.out.println("学生说：啷个楞个快斗上课了唉！！！");
    }
}

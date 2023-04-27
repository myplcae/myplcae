package src.com.Designpattern.behavior.observer;
//观察者模式
public class TestObserver {

    public static void main(String[] args) {

        Observer observer = new StudentObserver();
        Observer observer1 = new StudentObserver();
        Observer observer2= new TeacherObserver();

        Subject subject = new BellSubject();
        subject.addObersver(observer);
        subject.addObersver(observer1);
        subject.addObersver(observer2);

        subject.notifyObserver();
    }
}

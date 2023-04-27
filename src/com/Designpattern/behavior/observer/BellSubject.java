package src.com.Designpattern.behavior.observer;

public class BellSubject extends Subject{
    @Override
    void addObersver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    void removeObersver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    void notifyObserver() {
        System.out.println("闹铃响了！！！！！！！！！！！");
        for (Observer observer: this.observerList){
            observer.reponse();
        }
    }
}

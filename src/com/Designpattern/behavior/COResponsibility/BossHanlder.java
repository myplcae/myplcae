package src.com.Designpattern.behavior.COResponsibility;

public class BossHanlder extends Handler{
    @Override
    void process(int leaveDays) {
        if (leaveDays <= 3){
            System.out.println("老板直接同意请假");
            return;
        }
        this.nextHandler.process(leaveDays);
    }
}

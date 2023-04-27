package src.com.Designpattern.behavior.COResponsibility;

public class LeaderHandler extends Handler{

    @Override
    void process(int leaveDays) {
        if (leaveDays <= 0){
            System.out.println("老板说你这个不得行，拿回去重做");
            return;
        }
        if (leaveDays <=1){
            System.out.println("老板说你可以放假，去耍嘛");
            return;
        }
        this.nextHandler.process(leaveDays);
    }
}

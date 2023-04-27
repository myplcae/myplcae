package src.com.Designpattern.behavior.COResponsibility;

public class BossLeaderHanlder extends Handler{

    @Override
    void process(int leaveDays) {
        if (leaveDays <= 7){
            System.out.println("老板娘同意请假");
        }else {
            System.out.println("你爬嘛，你不配请假");
        }
    }
}

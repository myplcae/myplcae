package src.com.Designpattern.behavior.COResponsibility;
//责任链模式
public class TestResponsibility {

    public static void main(String[] args) {
        Handler leaderHandler = new LeaderHandler();
        Handler bossHanlder = new BossHanlder();
        Handler bossLeaderHanlder = new BossLeaderHanlder();

        leaderHandler.setNextHandler(bossHanlder);
        bossHanlder.setNextHandler(bossLeaderHanlder);

        leaderHandler.process(1);
        leaderHandler.process(2);
        leaderHandler.process(3);
    }
}

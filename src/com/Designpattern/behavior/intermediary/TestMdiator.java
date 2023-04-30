package src.com.Designpattern.behavior.intermediary;

import java.util.List;
//中介者模式
public class TestMdiator {

    public static void main(String[] args) {
        Person zhangkaiguo = new Male("张开国",1,25,23,27);
        Person chenmingming = new Male("陈明明",1,25,25,30);
        Person fanxu = new Male("范旭",1,25,23,27);

        Person fupo1 = new Female("李嬢嬢",2,26,25,40);
        Person fupo2 = new Female("谢姐",2,28,29,30);
        //Person fupo3 = new Female("老板娘",2,42,26,45);

        Mediator mediator = new MarriageMediator();
        mediator.regist(zhangkaiguo);
        mediator.regist(chenmingming);
        mediator.regist(fanxu);
        mediator.regist(fupo1);
        mediator.regist(fupo2);
        //mediator.regist(fupo3);

        fupo1.setMediator(mediator);
        List<Person> love = fupo1.findLove();
        love.forEach(System.out::println);
    }
}

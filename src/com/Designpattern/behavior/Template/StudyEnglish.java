package src.com.Designpattern.behavior.Template;

public class StudyEnglish extends StudyTemplate{
    @Override
    void preview() {
        System.out.println("背单词");
    }

    @Override
    void listen() {
        System.out.println("听老师讲课");
    }

    @Override
    void review() {
        System.out.println("自己看书复习");
    }

    @Override
    void practice() {
        System.out.println("做两套英语卷子");
    }

    @Override
    void summary() {
        System.out.println("通过做题和看书归纳总结学习内容");
    }
}

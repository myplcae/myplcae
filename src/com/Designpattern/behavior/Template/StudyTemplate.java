package src.com.Designpattern.behavior.Template;
//模板方法模式
public abstract class StudyTemplate {

    //模板方法
    final void study(){

        preview();//课前准备
        listen();//听讲
        review();//复习
        practice();//巩固
        summary();//总结

    }
    abstract void preview();
    abstract void listen();
    abstract void review();
    abstract void practice();
    abstract void summary();
}

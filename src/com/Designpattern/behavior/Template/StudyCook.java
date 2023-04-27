package src.com.Designpattern.behavior.Template;

public class StudyCook extends StudyTemplate{
    @Override
    void preview() {
        System.out.println("准备好食材");
    }

    @Override
    void listen() {
        System.out.println("看一哈脑残小红书跟着做饭");
    }

    @Override
    void review() {
        System.out.println("喊人尝一下菜做的怎么样");
    }

    @Override
    void practice() {
        System.out.println("自己再多做几次");
    }

    @Override
    void summary() {
        System.out.println("自己记录做饭的步骤和方法，下次自己做更快~~~~");
    }
}

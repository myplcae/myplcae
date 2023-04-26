package src.com.Designpattern.structure.agent;

public class ContraProxy implements Game{

    private Contra contra;

    public ContraProxy(Contra contra) {
        this.contra = contra;
    }

    //代理角色
    @Override
    public void play() {
        this.preplay();
        contra.play();
        this.afterplay();
    }

    //功能扩充
    private void preplay(){
        System.out.println("魂斗罗游戏开始前~~~~~~~~~~~");
    }

    private void afterplay(){
        System.out.println("魂斗罗游戏结束后");
    }
}

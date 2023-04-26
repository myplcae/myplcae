package src.com.Designpattern.structure.agent;

public class Contra implements Game{
    //在外面无法被调用
    private Contra(){

    }
    //真实主体角色
    @Override
    public void play() {
        System.out.println("魂斗罗游戏~~~~~~~~开始干啦！！！！！！！！！！！！！");
    }

    public static ContraProxy getProxy(){
        Contra contra = new Contra();
        return new ContraProxy(contra);
    }
}

package src.com.Designpattern.behavior.command;
//电视遥控器
public class TVCommand implements Command{

    private TV tv = new TV();

    @Override
    public void execute() {
        tv.Open();
    }

    @Override
    public void revoke() {
        tv.stayOn();
    }
}

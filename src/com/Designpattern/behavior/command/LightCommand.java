package src.com.Designpattern.behavior.command;
//灯泡遥控器
public class LightCommand implements Command{

    private Light light;

    public LightCommand() {
        light = new Light();
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void revoke() {
        light.turnOff();
    }
}

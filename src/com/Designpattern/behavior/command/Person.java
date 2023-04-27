package src.com.Designpattern.behavior.command;
//遥控器的控制者
public class Person {

    private Command command;

    public void   setCommand(Command command) {
        this.command = command;
    }

    public void doIt(){
        this.command.execute();
    }

    public void unDo(){
        this.command.revoke();
    }
}

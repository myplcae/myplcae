package src.com.Designpattern.behavior.command;

public class TestCommand {

    public static void main(String[] args) {
        Person person = new Person();
        Command lightCommand = new LightCommand();
        Command tvCommand = new TVCommand();
        person.setCommand(lightCommand);
        person.doIt();
        person.unDo();


        person.setCommand(tvCommand);

        person.doIt();
        person.unDo();
    }
}

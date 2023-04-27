package src.com.Designpattern.behavior.command;

public interface Command {
    //执行命令
    void execute();
    //撤销命令
    void revoke();

}

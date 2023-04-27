package src.com.Designpattern.behavior.interpreter;

import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expressions {

    public Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        for (String s:data){
            set.add(s);
        }
    }
    @Override
    public boolean intrepret(String info){
        if (set.contains(info)){
            return true;
        }
        return false;
    }
}

package src.com.Designpattern.behavior.visitor.movie;

import src.com.Designpattern.behavior.visitor.Movie;
import src.com.Designpattern.behavior.visitor.Visitor;

public class GoodByMyLoser implements Movie {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String getName(){
        return "夏洛特烦恼";
    }
}

package src.com.Designpattern.behavior.visitor.visit;

import src.com.Designpattern.behavior.visitor.Visitor;
import src.com.Designpattern.behavior.visitor.movie.GoodByMyLoser;
import src.com.Designpattern.behavior.visitor.movie.Wolf;

public class Chenmingming implements Visitor {
    @Override
    public void visit(Wolf wolf) {
        System.out.println("明明也去看"+wolf.getName()+"了！！！");
    }

    @Override
    public void visit(GoodByMyLoser goodByMyLoser) {
        System.out.println("明明看了"+goodByMyLoser.getName()+"打了六分");
    }
}

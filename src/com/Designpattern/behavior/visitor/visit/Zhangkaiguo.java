package src.com.Designpattern.behavior.visitor.visit;

import src.com.Designpattern.behavior.visitor.Visitor;
import src.com.Designpattern.behavior.visitor.movie.GoodByMyLoser;
import src.com.Designpattern.behavior.visitor.movie.Wolf;

public class Zhangkaiguo implements Visitor {
    @Override
    public void visit(Wolf wolf) {
        System.out.println("开国去看"+wolf.getName()+"吧！！！");
    }

    @Override
    public void visit(GoodByMyLoser goodByMyLoser) {
        System.out.println("开过看了"+goodByMyLoser.getName()+"打了八分");
    }
}

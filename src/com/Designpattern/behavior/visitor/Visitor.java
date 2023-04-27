package src.com.Designpattern.behavior.visitor;

import src.com.Designpattern.behavior.visitor.movie.GoodByMyLoser;
import src.com.Designpattern.behavior.visitor.movie.Wolf;

//访问者观看
public interface Visitor {

    void visit(Wolf wolf);

    void visit(GoodByMyLoser goodByMyLoser);
}

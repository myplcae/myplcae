package src.com.Designpattern.behavior.visitor;

import src.com.Designpattern.behavior.visitor.movie.GoodByMyLoser;
import src.com.Designpattern.behavior.visitor.movie.Wolf;
import src.com.Designpattern.behavior.visitor.visit.Chenmingming;
import src.com.Designpattern.behavior.visitor.visit.Zhangkaiguo;

public class TestVisit {

    public static void main(String[] args) {
        Theater theater = new Theater();

        Wolf wolf = new Wolf();
        GoodByMyLoser goodByMyLoser = new GoodByMyLoser();
        theater.add(wolf);
        theater.add(goodByMyLoser);


        theater.accept(new Zhangkaiguo());
        System.out.println("------------------------------");
        theater.accept(new Chenmingming());
        System.out.println("******************************");
    }
}

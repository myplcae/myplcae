package src.com.Designpattern.behavior.interpreter;

public class NonterminalExpress implements Expressions{

    private Expressions cityExpression;

    private Expressions peopleExpression;

    public NonterminalExpress(Expressions cityExpression,Expressions peopleExpression){
        this.cityExpression = cityExpression;
        this.peopleExpression = peopleExpression;
    }

    @Override
    public boolean intrepret(String info) {
        String[] arr = info.split("的");
        return cityExpression.intrepret(arr[0]) && peopleExpression.intrepret(arr[1]);
    }
}

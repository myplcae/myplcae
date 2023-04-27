package src.com.Designpattern.behavior.interpreter;

public class Context {
    private Expressions expression;

    private String[] citys = {"北京","上海","日本","欧洲","非洲"};

    private String[] peoples = {"张开国","大桥老师","白皮猪","倪哥"};

    public Context(){
        Expressions cityExpression = new TerminalExpression(citys);
        Expressions peopleExpression = new TerminalExpression(peoples);
        this.expression = new NonterminalExpress(cityExpression,peopleExpression);
    }
    //坐公交免费
    public boolean isFree(String info){
        return expression.intrepret(info);
    }
}

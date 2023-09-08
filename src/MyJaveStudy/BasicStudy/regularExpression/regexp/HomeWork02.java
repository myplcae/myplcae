package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

public class HomeWork02 {
    public static void main(String[] args) {
        //验证数字类型：正整数、负整数、小数
        String content = "-0.23";
        String regString = "^[+-]?([1-9]\\d*|0)(\\.\\d+)?$";
        if (content.matches(regString)){
            System.out.println("是个整数或者小数");
        }else {
            System.out.println("匹配失败");
        }
    }
}

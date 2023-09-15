package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;
import java.util.Stack;

public class HJ50 {
    public static void main(String[] args) throws ScriptException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //方法一：用栈自己写的
        //System.out.println(calc(str));
        if (str != null){
            str = str.replace("{","(");
            str = str.replace("}",")");
            str = str.replace("[","(");
            str = str.replace("]",")");
        }
        //方法二：调用js方法包直接计算

        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        System.out.println(scriptEngine.eval(str));
    }
    //方法一：自己写一个四则运算法则
//    public static int calc(String str){
//        Stack<Integer> stack = new Stack<>();//定义一个栈
//        char chars = '+';
//        int num = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isDigit(c)) {//用于判断指定字符是否是数字，返回boolean类型
//                num = num * 10 + (int) (c - '0');//转回int
//            }else if (c == '('){
//                int count = 1;
//                int endPos = i + 1;
//                while (endPos < str.length()){
//                    if (str.charAt(endPos) == ')') {
//                        if (--count == 0)
//                            break;
//                    }else if (str.charAt(endPos) == '(')
//                                ++count;
//                                ++endPos;
//                    }
//                    num = calc(str.substring(i + 1,endPos));
//                    i = endPos;
//                }else{
//                    switch (chars){
//                        case '+':stack.push(num);
//                        break;
//                        case '-':stack.push(-num);
//                        break;
//                        case '*':stack.push(stack.pop()*num);
//                        break;
//                        case '/':stack.push(stack.pop()/num);
//                        break;
//                }
//                num = 0;
//                chars  = c;
//            }
//        }
//        switch (chars){
//            case '+':stack.push(num);
//                break;
//            case '-':stack.push(-num);
//                break;
//            case '*':stack.push(stack.pop()*num);
//                break;
//            case '/':stack.push(stack.pop()/num);
//                break;
//        }
//        int sum = 0;
//        while (!stack.isEmpty()){
//            sum += stack.pop();
//        }
//        return sum;
//    }
}

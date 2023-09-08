package src.MyJaveStudy.BasicStudy.regularExpression.regexp;



//img15：验证电子邮件格式
public class HomeWork01 {
    public static void main(String[] args) {
        String content = "wengcai@sohu.com";
        String regString = "[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+";
        if (content.matches(regString)){
            System.out.println("匹配成功");
        }else {
            System.out.println("匹配失败");
        }
    }
}

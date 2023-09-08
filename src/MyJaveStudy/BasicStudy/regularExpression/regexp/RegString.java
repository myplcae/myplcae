package src.MyJaveStudy.BasicStudy.regularExpression.regexp;
//String类中的正则使用
public class RegString {
    public static void main(String[] args) {
        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。" +
                "2001年9月24日，J2EE1.3发布。2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升";
        //使用正则把JDK1.3和JDK1.4换成JDK
        content = content.replaceAll("JDK1\\.3|JDK1\\.4", "JDK");
        System.out.println(content);
        //验证一个手机号
        content = "15696417238";
        if (content.matches("1(56|58)\\d{8}")){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }
        //分割功能
        content = "hello#abc-jack12sminth~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (Object o : split) {
            System.out.println("分割后的字符串包括：----->" + o);
        }

    }
}

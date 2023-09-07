package src.MyJaveStudy.BasicStudy.collection.code.map;
import java.util.Properties;
@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {
        //新增
        Properties properties = new Properties();
        //properties.put(null,"qweqqe");//异常：NullPointerException,key不能为空
        properties.put("陈明明",100);
       //properties.put("陈明明",null);//异常：NullPointerException,value不能为空
        properties.put("陈明明",6546578);//相同的key情况下，value会被替换
        properties.put("张开国",43352);
        properties.put("小范","qwhejqwe123");
        properties.put("黑哥","asguyqe456546");
        System.out.println(properties);
//        for (Object value : properties) {
//            System.out.println("value包括：" + properties);
//        }
        //通过key获取value
        System.out.println("小范的密码是： " + properties.get("小范"));
        //删除remove
        properties.remove("黑哥");
        System.out.println("properties包括：" + properties);
        //修改，put进去一个相同的key
        properties.put("小范" , "asjhsjah");
        System.out.println(properties);
        //查找
        System.out.println(properties.get("小范"));
        System.out.println(properties.getProperty("小范"));
    }
}

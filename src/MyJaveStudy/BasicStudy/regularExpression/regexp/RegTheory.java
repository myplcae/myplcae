package src.MyJaveStudy.BasicStudy.regularExpression.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则原理
public class RegTheory {
    public static void main(String[] args) {
        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。1999年6月，Sun公司发布了第二代Java平台（简称为Java2）的3个版本：J2ME（Java2 Micro Edition，Java2平台的微型版）" +
                "，应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的标准版），应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应用于基于Java" +
                "的应用服务器。" +
                "3443Java 2平台的发布，是Java发展过程中最重要的一个里程碑，标志着Java的应用开始普及。9889";
        //匹配四个数字的字符串
        //解释：\\d 表示一个任意的数字
        String regString = "(\\d\\d)(\\d\\d)";
        //创建正则模式对象
        Pattern pattern = Pattern.compile(regString);
        //创建匹配器
        //表示创建一个匹配器，按照正则表达式的规则，即上面写好的规则regString
        Matcher matcher = pattern.matcher(content);
        //开始循环匹配
        /**
         * 源码分析：
         * find方法：
         *      public boolean find() {
         *         int nextSearchIndex = last;
         *         if (nextSearchIndex == first)
         *             nextSearchIndex++;
         *
         *         // If next search starts before region, start it at region
         *         if (nextSearchIndex < from)
         *             nextSearchIndex = from;
         *
         *         // If next search starts beyond region then it fails
         *         if (nextSearchIndex > to) {
         *             for (int i = 0; i < groups.length; i++)
         *                 groups[i] = -1;
         *             return false;
         *         }
         *         return search(nextSearchIndex);
         *     }
         * matcher.group方法：
         *       public String group(int group) {
         *         if (first < 0)
         *             throw new IllegalStateException("No match found");
         *         if (group < 0 || group > groupCount())
         *             throw new IndexOutOfBoundsException("No group " + group);
         *         if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
         *             return null;
         *         return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
         *     }
         * */
        /**
         * 分组的概念：比如:(\d\d)(\d\d),如果有小括号就是分组，一组括号代表一组
         *  源码：
         *      boolean search(int from) {
         *         this.hitEnd = false;
         *         this.requireEnd = false;
         *         from        = from < 0 ? 0 : from;
         *         this.first  = from;
         *         this.oldLast = oldLast < 0 ? from : oldLast;
         *         for (int i = 0; i < groups.length; i++)
         *             groups[i] = -1;
         *         acceptMode = NOANCHOR;
         *         boolean result = parentPattern.root.match(this, from, text);
         *         if (!result)
         *             this.first = -1;
         *         this.oldLast = this.last;
         *         return result;
         * */
        while (matcher.find()){
            //System.out.println("找到的结果为：" + matcher.group(0));
            System.out.println("第一组()匹配到的值=:" + matcher.group(1));
            System.out.println("第二组()匹配到的值=:" + matcher.group(2));
        }
    }
}

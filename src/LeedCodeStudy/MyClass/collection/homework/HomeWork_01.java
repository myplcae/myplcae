package src.LeedCodeStudy.MyClass.collection.homework;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class HomeWork_01 {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new News("新冠病例超千万,数百万印度教徒赴恒河\"圣浴\"引民众担忧"));
        arraylist.add(new News("男子突然想起2月前钓的鱼还在网兜，捞起一看赶紧放生"));
        int size = arraylist.size();
        for (int i = size-1; i >=0; i--) {
            //System.out.println(arraylist.get(i));
            News news = (News) arraylist.get(i);
            System.out.println(limitTitle(news.getTitle()));
        }
    }
    //写一个方法处理标题限制15个字符
    public static String limitTitle(String title){
        if ( null == title){
            return "";
        }
        if (title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String substance;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubstance() {
        return substance;
    }

    public void setSubstance(String substance) {
        this.substance = substance;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}

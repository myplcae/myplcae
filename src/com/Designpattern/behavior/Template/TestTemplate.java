package src.com.Designpattern.behavior.Template;
//模板方法模式
public class TestTemplate {

    public static void main(String[] args) {
        StudyTemplate studyTemplate = new StudyEnglish();
        studyTemplate.study();
        System.out.println("=====================");
        studyTemplate = new StudyCook();
        studyTemplate.study();
    }
}

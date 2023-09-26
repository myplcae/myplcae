package src.MyJaveStudy.BasicStudy.StringStudy.code;

public class TestSplit {
    public static void main(String[] args) {
        String s = "白日依山尽#黄河入海流#欲穷千里目#更上一层楼";
        String[] result = s.split("#");
        for (String value : result) {
            System.out.println(value);//StringTokenizer
        }
    }
}

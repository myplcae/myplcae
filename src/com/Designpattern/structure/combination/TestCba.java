package src.com.Designpattern.structure.combination;

public class TestCba {

    public static void main(String[] args) {
        Composite china = new Composite("中国");

        Component BJ = new Leaf("北京",2200);
        Component SH = new Leaf("上海",2500);
        Composite SD = new Composite("山东");
        Composite HB = new Composite("河北");

        Component qd = new Leaf("青岛",1000);
        Component jn = new Leaf("济南",600);
        Component bd = new Leaf("保定",1000);

        SD.add(qd);
        SD.add(jn);
        HB.add(bd);

        china.add(BJ);
        china.add(SH);
        china.add(SD);
        china.add(HB);

        china.cal();
    }
}

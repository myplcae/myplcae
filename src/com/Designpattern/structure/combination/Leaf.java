package src.com.Designpattern.structure.combination;

public class Leaf implements Component{

    //定义参数
    private String city;//名字

    private int person;//个数

    public Leaf(String city, int person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public int cal() {
        System.out.println(city+"人口"+person+"万");
        return 0;
    }
    //计算人口
}

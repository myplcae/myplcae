package src.com.Designpattern.structure.Flyweight;

public class PhoneCharger extends Charge{

    private String id;

    public PhoneCharger(String id){
        this.id = id;
    }

    @Override
    public void use(Person person) {
        state = 1;
        System.out.println("当前充电宝"+id+"正在被"+person.getName()+"使用中");
    }

    @Override
    public void back() {
        state = 0;
        System.out.println(id+"充电宝已归还");
    }
}

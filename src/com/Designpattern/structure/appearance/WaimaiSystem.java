package src.com.Designpattern.structure.appearance;

public class WaimaiSystem {

    private final OrderSystem orderSystem = new OrderSystem();

    private final DeliverySystem deliverySystem = new DeliverySystem();

    private final CookSystem cookSystem = new CookSystem();

    public void getFood(){
        orderSystem.acceptOrder();
        cookSystem.cook();
        deliverySystem.delivery();
    }
}

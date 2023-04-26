package src.com.Designpattern.structure.Flyweight;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class Factory {

    private Factory(){
        pool.add(new PhoneCharger("1号"));
        pool.add(new PhoneCharger("2号"));
        pool.add(new PhoneCharger("3号"));
    }

    private static final Factory instance =new Factory();

    public static Factory getInstance(){
        return instance;
    }

    private Set<Charge> pool = new HashSet<>();

    public Charge getCharge(){
        for (Charge charge:pool){
            if (charge.getState() == 0){
                return charge;
            }
        }
        return null;
    }


}

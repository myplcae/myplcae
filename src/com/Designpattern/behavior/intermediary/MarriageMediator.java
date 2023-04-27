package src.com.Designpattern.behavior.intermediary;

import java.util.ArrayList;
import java.util.List;

public class MarriageMediator extends Mediator{

    private List<Person> males = new ArrayList<>();

    private List<Person> females = new ArrayList<>();

    @Override
    void regist(Person person) {
        if (person.getAge() == 1){
            males.add(person);
        }else {
            females.add(person);
        }
    }

    @Override
    List<Person> match(Person person) {
        List<Person> matches = new ArrayList<>();
        if (person.getSex() == 1){
            for (Person female : females){
                if (female.getAge() <= person.getMaxage() && female.getAge() >=person.getMinage()){
                    if (person.getAge() >= female.getMinage() && person.getAge() <= female.Maxage){
                        matches.add(female);
                    }
                }
            }
        }
        else {
            for (Person male : males){
                if (male.getAge() <= person.getMaxage() && male.getAge() >=person.getMinage()){
                    if (person.getAge() >= male.getMinage() && person.getAge() <= male.Maxage){
                        matches.add(male);
                    }
                }
            }
        }
        return matches;
    }
}

package src.com.Designpattern.behavior.intermediary;

import java.util.List;

public abstract class Mediator {

    abstract void regist(Person person);

    abstract List<Person> match(Person person);
}

package src.com.Designpattern.behavior.iterator;
//迭代器模式
public class TestItertor {

    public static void main(String[] args) {
        Container container = new ArrayListContainer();

        container.add("LOL");
        container.add("ZKG");
        container.add("CMM");

        Iterator iterator = container.getiterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        container = new SetContainer();
        container.add("DNF");
        container.add("BSKL");
        container.add("KKKL");
        iterator = container.getiterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

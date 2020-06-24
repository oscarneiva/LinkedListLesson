package project;
import java.util.LinkedList;

public class List {
    private LinkedList<Fruit> fruits;
    private Fruit fruit;

    public List(){
        fruits = new LinkedList<Fruit>();
        fruit = new Fruit("banana","banana","yellow");
        fruits.add(fruit);
        fruit = new Fruit("Apple","Apple","Red");
        fruits.add(fruit);
        fruit = new Fruit("Lemon","Citric","Green");
        fruits.add(fruit);
    }

    public LinkedList<Fruit> readList(){
        return fruits;
    }
}

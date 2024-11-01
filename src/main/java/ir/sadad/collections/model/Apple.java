package ir.sadad.collections.model;

public class Apple extends Fruit implements Comparable<Apple> {

    public Apple(int size) {
        super("Apple", size);
    }

    public int compareTo(Apple a) {
        return super.compareTo(a);
    }
}

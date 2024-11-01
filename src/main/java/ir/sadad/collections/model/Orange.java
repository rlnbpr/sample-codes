package ir.sadad.collections.model;

public class Orange extends Fruit implements Comparable<Orange> {
    public Orange(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(Orange o) {
        return super.compareTo(o);
    }
}

package ir.sadad.collections.model;

import java.util.Objects;

public abstract class Fruit { //implements Comparable<Fruit> {
    protected String name;
    protected int size;

    public Fruit() {
    }

    protected Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public boolean equals(Object o) {
        if (o instanceof Fruit) {
            Fruit that = (Fruit)o;
            return this.name.equals(that.name) && this.size == that.size;
        } else return false;
    }
    public int hashCode() {
        return Objects.hash(name,size);
    }
    public int compareTo(Fruit that) {
        return Integer.compare(this.size, that.size);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

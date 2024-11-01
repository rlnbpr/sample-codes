package ir.sadad.collections;

import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("tyerst");
    }

    // The highlighted phrase in angle brackets at the beginning of the type signature
//    declares the type variable T, and we say that T is bounded by
//    Comparable<T>. As with wildcards, bounds for type variables are always
//    indicated by the keyword extends, even when the bound is an interface rather
//    than a class, as is the case here. Unlike wildcards, type variables can only be
//    bounded using extends, not super.
    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();
        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }
}

package ir.sadad.collections.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(2);
        Orange o3 = new Orange(3);
        Orange o4 = new Orange(4);
        List<Apple> apples = Arrays.asList(a1, a2);
        System.out.println(Collections.max(apples).equals(a2));
        List<Orange> oranges = Arrays.asList(o3, o4);
        System.out.println(Collections.max(oranges).equals(o4));
        List<Fruit> mixed = List.of(a1, o3);
        System.out.println(Collections.max(mixed).equals(o3));
// compile-time error
    }
}

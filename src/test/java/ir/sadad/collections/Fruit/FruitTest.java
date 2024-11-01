package ir.sadad.collections.Fruit;

import ir.sadad.collections.model.Apple;
import ir.sadad.collections.model.Fruit;
import ir.sadad.collections.model.Orange;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruitTest {

    @Test
    void doTest() {
        Apple a1 = new Apple(1);
        Apple a2 = new Apple(2);
        Orange o3 = new Orange(3);
        Orange o4 = new Orange(4);
        List<Apple> apples = Arrays.asList(a1, a2);
        assert Collections.max(apples).equals(a2);
        List<Orange> oranges = Arrays.asList(o3, o4);
        assert Collections.max(oranges).equals(o4);
//        List<Fruit> mixed = List.of(a1, o3);
//        Collections.max(mixed);
// compile-time error

    }
}

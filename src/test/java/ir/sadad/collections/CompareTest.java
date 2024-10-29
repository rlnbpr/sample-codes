package ir.sadad.collections;

import org.junit.jupiter.api.Test;


class CompareTest {

    @Test
    void compareInt() {
        // Integer implements Comparable<Integer>
        Integer int0 = 0;
        Integer int1 = 1;
        assert int0.compareTo(int1) < 0;
    }

    @Test
    void compareString() {
        // also String implements Comparable<String>
        String str0 = "zero";
        String str1 = "one";
        assert str0.compareTo(str1) > 0;
    }
}

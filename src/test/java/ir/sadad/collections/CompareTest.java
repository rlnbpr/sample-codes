package ir.sadad.collections;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;


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

    @Test
    void compareDouble() {
        Double aDouble = 1.0;
        Double bDouble = 1.0;
//        System.out.println(aDouble == bDouble);
        assert aDouble != bDouble;
        assert aDouble.equals(bDouble);
        assert aDouble.compareTo(bDouble) == 0;
    }

    @Test
    void compareBigDecimal() {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(1.000);
        assert bigDecimal1 != bigDecimal2;
        assert !bigDecimal2.equals(bigDecimal1);
        assert bigDecimal2.compareTo(bigDecimal1) == 0;
    }
}

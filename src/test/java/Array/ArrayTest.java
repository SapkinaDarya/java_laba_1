package Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTest {
    private int a_1;
    private int a_2;
    private int a_3;

    @BeforeEach
    void setUp() throws Exception {
        a_1 = 78;
        a_2 = -8;
        a_3 = 9;
    }

    @Test
    void add() {
        Array a = new Array(0);
        a.add(a_1);
        a.add(a_2);
        a.add(a_3);
        Assertions.assertEquals(3, a.getSize());
    }

    @Test
    void getElem() {
        Array a3 = new Array(1);
        a3.add(0);
        a3.add(1);
        a3.add(2);
        Object result = a3.getElem(1);
        Assertions.assertEquals(1, result);
    }

    @Test
    void delete() {
        Array a2 = new Array(5);
        a2.add(5);
        a2.add(3);
        a2.add(5);
        a2.add(2);
        a2.add(5);
        a2.delete(3);
        a2.delete(2);
        Assertions.assertEquals(3, a2.getSize());
    }

    @Test
    void testEquals() {
        Array a4 = new Array(1);
        a4.add(4);
        a4.add(5);
        Array a5 = new Array(1);
        a5.add(4);
        a5.add(5);
        Assertions.assertEquals(true, a4.equals(a5));
    }

    @Test
    void testToString() {
        Array a6 = new Array(1);
        a6.add(4);
        a6.add(7);
        a6.add(8);
        String exp = "[4, 7, 8]";
        Assertions.assertEquals(exp, a6.toString());
    }
}
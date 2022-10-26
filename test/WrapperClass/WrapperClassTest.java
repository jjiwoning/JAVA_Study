package WrapperClass;

import org.junit.jupiter.api.Test;

public class WrapperClassTest {

    @Test
    void IntegerTest() {
        Integer a = 6;
        Integer b = 6;
        System.out.println(a == b);

        Integer c = new Integer(7);
        Integer d = new Integer(7);
        int e = 7;

        System.out.println(c == d);
        System.out.println(c == e);
    }

    @Test
    void LongTest() {
        Long a = 1L;
        Long b = 1L;

        System.out.println("(a == b) = " + (a == b));
    }
}

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
}

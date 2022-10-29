package WrapperClass;

import org.junit.jupiter.api.Assertions;
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

        Assertions.assertEquals(a, b);
    }

    @Test
    void valueFunc(){
        //given
        Long a = 3L;
        Long b = new Long(3);

        //then
        Assertions.assertTrue(a.longValue() == b.longValue());
    }
}

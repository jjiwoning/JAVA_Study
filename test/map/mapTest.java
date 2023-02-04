package map;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class mapTest {

    @Test
    void mapExceptionTest() {
        Map<A, Integer> map = new HashMap<>();
        A a = new A();
        A b = new A();
        map.put(a, 11);
        map.put(b, 12);
    }

    class A {
    }

    class B extends A {
    }

}

package Hash;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashTest {

    @Test
    void hashTest() {
        String a = "tomtom";
        String b = "TamTam";
        int findHash1 = a.hashCode();
        int findHash2 = b.hashCode();
        System.out.println("findHash1 = " + findHash1);
        System.out.println("findHash2 = " + findHash2);
    }

    @Test
    void hashMapTest() {
        Map<Integer, String> map = new HashMap<>();
    }
}

package ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    List<String> list = new ArrayList<>();

    @BeforeEach
    void addList() {
        list.add("hi");
        list.add("hello");
        list.add("tom");
    }

    @Test
    void addTest() {
        list.add("hi");
        list.add("hello");
        Assertions.assertEquals(list.size(), 5);
    }

    @Test
    void typeTest() {
        List<Object> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add(10L);
    }
}

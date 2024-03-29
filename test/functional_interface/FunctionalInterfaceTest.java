package functional_interface;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class FunctionalInterfaceTest {

    @Test
    void lambdaTest() {

        int x = 5;
        int y = 6;

        MyClass myClass = new MyClass((a, b) -> System.out.println(a + b));
        myClass.call1(x, y);

        MyClass myClass1 = new MyClass((c, d) -> System.out.println(c * d));
        myClass1.call1(x, y);

        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

}

interface MyFunction{
    void call(int a, int b);
}

class MyClass {
    MyFunction myFunction;

    public MyClass(MyFunction myFunction) {
        this.myFunction = myFunction;
    }

    void call1(int a, int b) {
        myFunction.call(a, b);
    }
}
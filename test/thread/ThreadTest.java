package thread;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    void test1() {
        Sample sample = new Sample();
        Runnable a = () -> sample.call("tam");
        Thread thread = new Thread(a);
        Thread thread1 = new Thread(() -> {
            System.out.println("hello");
        });
        thread.run();
        thread1.run();
    }

    class Sample {
        void call(String s) {
            System.out.println("hello! " + s);
        }
    }

}

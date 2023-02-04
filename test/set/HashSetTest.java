package set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {

    @Test
    void test1() {
        HashSet<Sample> set = new HashSet<>();
        set.add(new Sample(1, 2, 3));
        set.add(new Sample(1, 2, 3));

        Assertions.assertTrue(set.size() == 1);
    }

    class Sample {
        int data1;
        int data2;
        int data3;

        public Sample(int data1, int data2, int data3) {
            this.data1 = data1;
            this.data2 = data2;
            this.data3 = data3;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Sample sample = (Sample) o;
            return data1 == sample.data1 && data2 == sample.data2 && data3 == sample.data3;
        }

        @Override
        public int hashCode() {
            return Objects.hash(data1, data2, data3);
        }
    }
}

package stream_study;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        System.out.println("=============================");

        long count = Arrays.stream(arr).count();
        System.out.println(count);

        System.out.println("=============================");

        Arrays.stream(arr).forEach((x) -> System.out.println(x + 1));

        System.out.println("=============================");

        Arrays.stream(arr).limit(3).forEach((x) -> System.out.println(x + 1));

        System.out.println("=============================");

        IntStream.range(3, 9).forEach(System.out::println);

        System.out.println("=============================");

        IntStream random = new Random().ints(1, 50);
        random.limit(5).forEach(System.out::println);
    }
}

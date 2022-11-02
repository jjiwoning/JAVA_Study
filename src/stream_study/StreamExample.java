package stream_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {3, 4, 6, 2, 1, 7, 9, 10};

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

        System.out.println("=============================");

        Arrays.stream(arr2).sorted().forEach(System.out::println);

        System.out.println("=============================");

        List<Member> members = new ArrayList<>();
        for (long i = 0; i < 5; i++) {
            members.add(new Member(i, "name" + i, (int) i, "city" + i, "num" + i));
        }

        List<MemberDto> memberDtos = members.stream()
                .map(m -> new MemberDto(m.getName(), m.getAge()))
                .collect(Collectors.toCollection(ArrayList::new));

        memberDtos.stream().forEach(System.out::println);
    }

    static class Member {
        Long id;
        String name;
        int age;
        String city;
        String phoneNumber;

        public Member(Long id, String name, int age, String city, String phoneNumber) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    static class MemberDto{
        String name;
        int age;

        public MemberDto(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "MemberDto{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}

package Lambda_Study;

public class Lambda_Main {
    public static void main(String[] args) {
        // 매개변수와 실행문으로만 작성한다.
        // 매서드를 재정의하지않고 바로 사용, 익명으로 사용
        // 중간 과정을 생략하고 핵심 부분만을 쓴다고 생각을 하자!
        Lambda_Interface li1 = (String s1, String s2, String s3) -> {
            System.out.println(s1 + " " + s2 + " " + s3);
        };
        li1.method1("Hello", "Java", "World");
        // 람다식의 주요 특징들
        // 매개 변수가 1개이거나 타입이 같으면 타입 생략가능
        // 실행문이 1개이면 {} 생략 가능
        // 매개변수, 실행문 둘 다 1개이면 () , {} 둘 생략 가능
        // 매개변수가 없으면 ()로 매개변수가 없음을 표현
        // 반환 값이 있다면, return x 등으로 반환 값 표기
    }
}

public class OperatorStudy {
    public static void main(String[] args) {
        // 대입 연산자
        int x = 10;
        int y = 20;

        // 산술 연산자
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        System.out.println("x * y = " + (x*y));
        System.out.println("x / y = " + (x/y));
        System.out.println("x % y = " + (x%y));

        // 복합 대입 연산자
        System.out.println("x += 10 -> x =" + (x+=10));
        x = 10;
        System.out.println("x -= 10 -> x =" + (x-=10));
        // 이 외에도 *, /, % 에도 활용이 가능하다.

        //관계 연산자
        x = 10;
        y = 20;
        System.out.println("x > y :"+(x > y));
        System.out.println("x >= y :"+(x >= y));
        System.out.println("x < y :"+(x < y));
        System.out.println("x <= y :"+(x <= y));
        System.out.println("x == y :"+(x == y));
        System.out.println("x != y :"+(x != y));

        //증감 연산자 (++, --)
        //증감 연산자의 위치가 변수의 앞에 있을 때: 문장 실행 전에 미리 증감이 실행 됨
        //증감 연산자의 위치가 변수의 뒤에 있을 때: 문장이 실행 되고난 후 증감이 실행 됨
        //디버그로 확인해보면 알 수 있다.
        x = 10;
        System.out.println("x++:"+(x++));
        System.out.println("x:"+x);

        //논리 연산자
        //&&(and) : 두 변수 모두 참이면 참 리턴 아니면 거짓
        //||(or) : 두 변수 중 하나만 참이면 참 리턴 둘 다 거짓일때 거짓 리턴
        //!(not) : 해당하는 변수를 부정 (참 -> 거짓) or (거짓 -> 참)

        //조건 연산자
        //조건식 ? 식1 : 식2 -> 조건식이 참이면 식1 거짓이면 식2 실행
        x = 10; y = 20;
        int result;
        result = (x < y) ? 100 : 200;
        System.out.println("result =" + result);

        //비트 연산자
        //비트 단위의 연산을 한다.
        // &(and) -> 두 비트가 1일때 1이 된다.
        // |(or) -> 두 비트 중 하나만 1이면 1이 된다.
        // ^(xor) -> 두 비트가 서로 다르면 1이 된다.
        // ~(not) -> 비트를 뒤집는다 (보수를 취함)
    }
}

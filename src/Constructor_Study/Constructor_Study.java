package Constructor_Study;

import java.util.Arrays;

public class Constructor_Study {
    private int num;
    private int []num2;
    // 기본 생성자
    // 기본 생성자가 없는 경우 컴파일러가 알아서 기본 생성자를 생성해서 호출한다.
    public Constructor_Study(){
        System.out.println("기본 생성자 호출");
    }
    // 사용자 정의 생성자함
    // 현재 객체를 가리킬 때 this라는 키워드를 사용한다. -> 매개변수 이름과 클래스 변수 이름이 같을때 사용
    public Constructor_Study(int num){
        System.out.println("사용자 정의 생성자 호출");
        this.num = num;
    }
    public Constructor_Study(int []i){
        System.out.println("사용자 정의 생성자 호출");
        num2 = i;
    }

    // 매서드
    public void printArray(){
        System.out.println(Arrays.toString(num2));
    }

    // 소멸자 -> override : 있다는 것만 알아두자, 알아서 처리 해줌.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("소멸자 호출");
        super.finalize();
    }
}

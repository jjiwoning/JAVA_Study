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
    // 사용자 정의 생성자
    public Constructor_Study(int i){
        System.out.println("사용자 정의 생성자 호출");
        num = i;
    }
    public Constructor_Study(int []i){
        System.out.println("사용자 정의 생성자 호출");
        num2 = i;
    }

    // 매서드
    public void printArray(){
        System.out.println(Arrays.toString(num2));
    }
}

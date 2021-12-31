public class OOP_Study {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍
        // 객체 -> 프로그래밍에서 속성과 기능을 가지는 프로그램 단위
        // 객체의 예시) 날씨 프로그램(속성: 온도, 미세먼지 기능: 날씨 예보), 사칙연산 프로그램(속성: +,-,*,/ 기능: 연산)
        // 클래스 -> 객체를 생성하기 위한 틀 모든 객체는 클래스로부터 생성된다.
        // 사칙연산 클래스 -> 필요에 따라 여러 개의 사칙연산 프로그램을 생성할 수 있게 해준다.
        // 객체를 만들기 위해 클래스가 필요하다. -> 클래스를 만들 필요가 있다.
        // 가비지 컬렉터가 다 쓰고 난 객체를 삭제를 해준다 -> 메모리 관리 용이
        // 클래스의 구성요소 -> 속성(멤버 변수) + 기능(메서드)로 구성이 된다.

        TomTom myDog = new TomTom();
        myDog.PrintName();

        TomTom yourDog = new TomTom("바보", "잡종", 12);
        yourDog.PrintName();
    }
}

class TomTom{
    private String name;
    private String greed;
    private int age;

    public TomTom(){
        name = "탐탐";
        greed = "말티즈";
        age = 11;
    }
    public TomTom(String n_name, String n_greed, int n_age){
        name = n_name;
        greed = n_greed;
        age = n_age;
    }

    public void PrintName(){
        System.out.printf("이름은 %s 입니다.\n",name);
    }

}
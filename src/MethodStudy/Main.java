package MethodStudy;

public class Main {
    public static void main(String[] args) {
        System.out.println("매서드에 대해 학습한 파일 입니다.");
        System.out.println("Method_Study 파일에 있는 Child 클래스를 호출합니다.");

        //객체 생성
        Method_Study TomTom = new Method_Study("탐탐", "수컷", 10);
        TomTom.getInfo();

        Method_Study child1 = new Method_Study();
        child1.setAge(12);
        child1.getInfo();

        System.out.println("두 객체는 같은 클래스에 속하지만 다른 주소에 있는 객체이다.");
        System.out.println("주소 값을 출력해서 직접 확인을 해보자.");
        // 객체의 이름을 출력하면 주소 값이 출력이 된다.
        System.out.println("TomTom의 주소: " + TomTom);
        System.out.println("child1의 주소: " + child1);
    }
}

public class OOP_Method_Study {
    public static void main(String[] args) {
        Car Kia = new Car(); //객체 생성 -> 생성자 호출됨
        Kia.Run(); // 매서드 호출
        Kia.Stop(); // 매서드 호출
        Kia.PrintColor(); // 매서드 호출

        TomTom Dog = new TomTom(); // 동일 패키지 내 외부 java 파일의 객체 생성 가능
        Dog.PrintName();
    }
}

class Car{ //클래스 이름: car
    //멤버 변수(속성) 선언
    private String color;
    private String gear;
    private int price;
    //private으로 두어 외부에서 변수에 접근할 수 없게 한다.

    public Car(){ //생성자 -> 클래스의 이름과 동일하게 둬야한다. 이 경우는 default 생성자 (리턴 없음)
        System.out.println("Car 객체가 생성 되었습니다.(생성자 호출)");
        color = "Black";
        gear = "default_gear";
        price = 30000000;
    }

    public void Run() { //매서드(c++에서 멤버 함수) 기능을 나타냄
        System.out.println("Run");
    }
    public void Stop(){
        System.out.println("Stop");
    }
    public void PrintColor(){ //private 변수에 접근하기 위한 함수 생성
        System.out.println(color);
    }
}
package Interface_Study;

public class Interface_MainClass {
    //인터페이스
    // 객체의 타입이 다형성으로 확장될 수 있다.
    // 실제 함수의 구현은 클래스에서 하자! 인터페이스는 함수 선언만!
    public static void main(String[] args) {
        // 인터페이스로 객체를 생성하는데 그 객체에 각각 클래스로 객체를 생성할 수 있다.
        // 아래의 코드를 보면 알 수 있다.
        Toy airplane = new ToyAirplane();
        // Toy > ToyAirplane 이기 때문에 Toy 객체로 ToyAirplane 호출 가능.
        Toy robot = new ToyRobot();

        // 아래의 코드를 보면 인터페이스로 서로 다른 클래스의 객체를 묶을 수 있다는 점을 확인가능
        // 그러나 인터페이스로 구현되는 함수만을 부를 수 있다. (인터페이스 객체이기 때문에)
        Toy []toys = {airplane, robot};
        for (int i = 0; i < toys.length; i++) {
            toys[i].walk();
            toys[i].run();
            toys[i].alarm();
            toys[i].light();

            System.out.println();
        }
    }


}

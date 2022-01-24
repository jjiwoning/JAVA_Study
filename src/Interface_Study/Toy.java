package Interface_Study;

public interface Toy {
    // 인터페이스는 매서드를 선언만 하지 정의를 하지 않는다.
    // why? -> 작업 명세서의 형식이라 생각하면 된다.
    // 내가 이 인터페이스를 쓰려면 밑의 함수를 클래스에서 정의를 해줘야 한다.
    public void walk();
    public void run();
    public void alarm();
    public void light();
}

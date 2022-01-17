package Information_hiding_Study.Main;

import Information_hiding_Study.Class1.*;

public class MainClass {
    public static void main(String[] args) {
        // 데이터 은닉
        // 클래스의 멤버 변수는 주로 private으로 설정하여 외부로 부터 데이터가 변질되는 것을 막는다.
        // private으로 설정된 멤버 변수를 외부에서 가져오거나 바꾸는 경우가 있다.
        // 이 때는 accessor, mutator 매서드를 만들어서 이를 동작하게 해준다.
        Class1 a = new Class1();
        // Setter(Mutator) 호출
        a.setInfo("tomtom", 15, "dog");
        // Getter(Accessor) 호출
        a.getInfo();
    }
}

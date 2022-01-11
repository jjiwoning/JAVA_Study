package Package_Study.Main;

import Package_Study.first.*;
import Package_Study.second.Package_second;

public class MainClass {
    public static void main(String[] args) {
        // 패키지
        // 하나의 프로젝트에는 수많은 클래스가 존재한다.
        // 이를 관리하기 편하게 하기 위해 패키지를 사용한다.
        // 다른 패키지에 있는 클래스를 사용하려면 import를 사용한다.
        Package_first example1 = new Package_first();
        Package_second example2 = new Package_second();
        // 스태틱
        // 클래스의 속성과 매서드에 static 키워드를 사용하면 어디서나 속성과 매서드를 공유할 수 있다.
        System.out.println(Package_first.a);
        Package_first.a = 10293;
        System.out.println(Package_first.a);
        // 위의 코드 결과를 확인해보면 어디서나 속성과 매서드를 공유할 수 있음을 알 수 있다.
    }
}

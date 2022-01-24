package AbstractClass_Study;

public class Inheritance_Bank extends Abstract_Bank {

    public Inheritance_Bank(){
        System.out.println("상속받은 클래스 생성자 호출");
    }
    @Override
    public void installmentSavings() {
        System.out.println("하위 클래스에서 정의한 적금 시스템");
    }
}

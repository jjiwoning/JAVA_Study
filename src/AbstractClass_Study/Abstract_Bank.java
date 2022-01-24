package AbstractClass_Study;

public abstract class Abstract_Bank {
    private int totalAmount;
    private String name;
    private String account;
    Abstract_Bank(){
        System.out.println("기본 생성자 호출");
    }
    // 예금
    public void deposit(){
        System.out.println("예금 함수가 출력됩니다.");
    }
    // 출금
    public void withdraw(){
        System.out.println("출금 함수가 출력됩니다. ");
    }
    // 적금 -> 추상 메서드
    public abstract void installmentSavings();
}

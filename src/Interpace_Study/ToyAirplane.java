package Interpace_Study;

public class ToyAirplane implements Toy{
    @Override
    public void walk() {
        System.out.println("비행기는 걷지 않아요");
    }

    @Override
    public void run() {
        System.out.println("비행기가 날기위해 달립니다");
    }

    @Override
    public void alarm() {
        System.out.println("비행기의 알람이 울립니다");
    }

    @Override
    public void light() {
        System.out.println("비행기가 야간 주행을 위해 빛을 냅니다.");
    }
}

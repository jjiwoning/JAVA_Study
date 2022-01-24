package Interface_Study;

public class ToyRobot implements Toy{

    @Override
    public void walk() {
        System.out.println("로봇이 걸어가요");
    }

    @Override
    public void run() {
        System.out.println("로봇이 뛰어요");
    }

    @Override
    public void alarm() {
        System.out.println("로봇에는 알람이 없어요");
    }

    @Override
    public void light() {
        System.out.println("로봇의 눈에서 빛이 나와요");
    }
}

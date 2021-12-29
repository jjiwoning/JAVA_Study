import java.util.Scanner;

public class For_While_Study {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 반복문 : 프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것
        // for 문 예시 (구구단 프로그램)
        System.out.println("1-9 중 하나를 입력하세요");
        int num = input.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d \n" , num, i, (num*i));
        }

        // while 문 조건을 바깥에 두어야 한다.
        int index = 1; // 주의! 이 변수를 while문 안에 넣으면 무한루프에 빠지게 된다.
        while(index <= 9){
            System.out.printf("%d\n", index);
            index++;
        }

        // do-while 문 -> 조건이 어떻게 되든 무조건 한 번은 수행한다는 점에서 while과 다르다.
        int a = 100;
        do{
            System.out.printf("a = %d \n", a);
        }while(a < 50);

        input.close();
    }
}

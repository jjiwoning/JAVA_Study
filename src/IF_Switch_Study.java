import java.util.Scanner; // 스캐너 import 하는 과정

public class IF_Switch_Study {
    public static void main(String[] args) {
        // 스캐너 객체 생성 -> 구문 외워두기
        Scanner input = new Scanner(System.in);
        // 조건문 (if, switch)
        // if : 양자택일 switch : 다자택일

        // if문 예시
        int num1 = 200;
        int num2 = 200;
        if(num1 > num2){
            System.out.println("num1이 더 크다.");
        }else if(num1 < num2){
            System.out.println("num2가 더 크다. ");
        }else{
            System.out.println("둘은 같다.");
        }


        // switch문 예시
        System.out.println("10단위 점수를 입력하세요.");
        int score = input.nextInt(); // int 형 입력 및 리턴
        switch (score){
            case 100:
            case 90:
                System.out.println("A학점 입니다.");
                // 주의! break를 안걸면 다음 문장도 실행하게 된다.
                break;
            case 80:
                System.out.println("B학점 입니다.");
                break;
            case 70:
                System.out.println("C학점 입니다.");
                break;
            case 60:
                System.out.println("D학점 입니다.");
                break;
            default:
                System.out.println("재수강 하세요~");
                break;
        }

        input.close();

    }
}

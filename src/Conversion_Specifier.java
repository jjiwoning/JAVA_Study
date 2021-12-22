public class Conversion_Specifier {
    public static void main(String[] args) {
        // 특수 문자
        System.out.println("Good\tMorning~"); // 탭 사용
        System.out.println("Good\nMorning~"); // 줄 바꿈 사용
        System.out.println("Good 'Morning'"); // '' 사용
        System.out.println("Good \"Morning\""); // " " 사용
        System.out.println("Good \\Morning\\"); // \ \ 사용

        // 서식 문자 -> 주의 사항: println이 아닌 printf를 활용 해야한다.
        System.out.printf("오늘의 날씨는 %d도 입니다.\n" , 10); //%d : 정수
        System.out.printf("오늘은 %d월 %d일 일껄?\n", 12, 22); // 여러개를 쓰는 방법
        int num1 = 20;
        System.out.printf("8진수 : %o\n", num1); // %o : 8진수
        System.out.printf("16진수 : %x\n", num1); // %x : 16진수
        System.out.printf("%c의 대문자는 %c 입니다.\n", 'a', 'A'); // %c : char
        System.out.printf("%s의 대문자는 %s 입니다.\n", "abc", "ABC"); // %s : String
        System.out.printf("%f는 실수입니다.\n", 1.234); // %f : 실수

        // 서식 문자의 정렬과 소수점 정리
        System.out.printf("%5d\n", 123); // %숫자d를 하면 숫자만큼의 칸으로 정렬이 된다.
        System.out.printf("%5d\n", 1234); // 5칸 정렬
        System.out.printf("%5d\n", 12345);

        System.out.printf("%.1f\n", 1.23456); // %.숫자f를 하면 숫자만큼 소수점 자리가 설정이 된다.
        System.out.printf("%.2f\n", 1.23456); // 숫자 = 2 이므로 소수점 2자리
        System.out.printf("%.3f\n", 1.23456); // 정렬할때 뒷 자리는 반올림이 된다.
    }
}

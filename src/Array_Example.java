import java.util.Arrays;
import java.util.Scanner;

public class Array_Example {

	public static void main(String[] args) {
		// 배열의 선언과 초기화
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4]);
		
		System.out.println();
		
		// 선언 및 초기화 동시에 하기.
		int[] arr2 = {10, 20, 30, 40, 50};
		
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4]);
		
		System.out.println();
		
		// 배열 사용 예제
		String[] name = {"양현종", "나성범", "최형우", "이의리", "김도영"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s의 점수를 입력하세요 : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s의 점수를 입력하세요 : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s 의 점수 : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 의 점수 : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 의 점수 : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 의 점수 : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 의 점수 : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-----------------------\n평균 점수 : \t%.2f", ave);
		
		scanner.close();
		
		System.out.println();
		
		// 배열의 기본 속성
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// 배열 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// 배열 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// 배열 복사 -> 데이터를 복사함 주소가 아닌
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// 배열 주소
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		System.out.println();
		
		// 2차원 배열
		int[][]  arrMul  = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

	}

}

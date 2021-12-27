// 배열

import java.util.Arrays;

public class Array_Study {

    public static void main(String[] args) {
        // 배열(Array)
        // 주의) 자바에서 배열은 한 번 크기가 선언되면 크기를 변경할 수 없다.
        // 배열의 선언 및 초기화
        int index = 5; //인덱스를 변수로 두어 배열 수정을 편하게 할 수 있다.
        int []arr1 = new int[index]; // 배열 선언
        // int[] arr2 = {10, 20, 30}; //이 형태로 선언 및 초기화 동시에 가능
        int n = 100;
        // 배열 초기화 과정
        for (int i = 0; i < index; i++) {
            arr1[i] = n;
            n += 100;
        }
        // 배열 출력
        for (int i = 0; i < index; i++) {
            System.out.printf("arr1[%d] = %d\n", i, arr1[i]);
        }
        // 배열과 메모리
        // 배열을 구성하는 데이터의 자료형에 따라서 메모리 크기가 결정된다.
        // 배열 변수는 배열 데이터의 주소를 담고 있다. -> 래퍼런스 값 가지고 있다. (첫 번째 배열의 주소를 가진다.)

        int[] arr3 = {10, 20 ,30 ,40 ,50};
        int[] arr4 = null;
        // 배열의 길이 출력함수
        System.out.println("arr3의 길이: " + arr3.length);
        // 배열 출력 (Arrays.toString(출력할 배열))
        System.out.println("arr3 = " + Arrays.toString(arr3));
        // 배열의 요소 복사 (Arrays.copyOf(배열이름, 배열이름.length)) -> 주소가 아닌 값을 복사
        arr4 = Arrays.copyOf(arr3, arr3.length);
        // 배열의 주소(레퍼런스) -> 이름을 적으면 주소값이 출력됨.
        System.out.println("arr3의 주소: " + arr3);
        System.out.println("arr4의 주소: " + arr4);
        }
    }


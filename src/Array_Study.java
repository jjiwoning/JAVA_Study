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
            System.out.printf("arr1[%d] = %d\n", i,arr1[i]);
        }
    }
}

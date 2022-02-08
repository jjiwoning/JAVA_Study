public class Exception_Study {
    // 예외처리 공부
    public static void main(String[] args) {
        // 예외가 발생하게 되면 예외가 발생한 줄에서 코드가 멈춘다.
        // -> 예외처리가 필요하다 (전체적인 코드에 방해가 되지 않게하기 위해서)
        // 자주 쓰이는 예외처리 구문 2가지
        // 1. try ~catch
        // 2. throws

        // try ~catch
//        try{
//            예외가 발생할 수 있는 코드
//        }catch (Exception e){
//            예외가 발생했을 때 처리할 코드
//        }

        int i = 10;
        int j = 0;
        int r = 0;

        try{
            r = i / j;
        }catch (Exception e) {
            e.printStackTrace(); // 어떠한 예외가 발생했는지 출력하는 함수
            String msg = e.getMessage(); // 예외를 간략하게 나타낸 문자열
            System.out.println("Exception:" + msg);
        }finally {
            // finally 내부의 코드는 예외와 상관없이 무조건 실행된다.
            System.out.println("예외와 관계없이 무조건 실행되는 코드");
        }
        System.out.println("예외처리 성공");
    }

    //throws : 예외가 발생시 예외처리를 직접하지 않고 호출한 곳으로 넘긴다.
    // 예외처리를 하지 않고 넘겨버림
}

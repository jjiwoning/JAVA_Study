import javax.sound.midi.Soundbank;

public class VariableType {
    public static void main(String[] args) {
        int a = 5;
        double b = 5.5;
        char c = 'a';
        boolean d = true;
        String e = "Hello Java";

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        // 형 변환 예시
        // 자동 형 변환 -> 작은 공간에서 큰 공간으로
        byte by = 10;
        int in = by;
        System.out.println("in = " + in);
        // 명시적 형 변환 -> 큰 공간에서 작은 공간으로 -> 데이터 누실 될 수 있다.
        int iVar = 123456;
        byte bVar = (byte)iVar;
        System.out.println("bVar = " + bVar);
    }
}

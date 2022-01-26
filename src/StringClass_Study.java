public class StringClass_Study {
    public static void main(String[] args) {
        // 문자열을 다루는 클래스에 대해 학습
        // 문자열을 다루는 string 객체는 데이터가 변화하면 메모리상의 변화가 커서 속도가 느리다.
        // 문자열이 변경되면 기존의 객체는 버려지고, 새로운 객체를 메모리에 생성하는 구조
        // 이 단점을 보완한 클래스가 StringBuffer, StringBuilder 클래스이다.
        // 둘은 거의 같다고 보면 된다. 메서드도 거의 같다.
        // 속도 Builder > Buffer, 데이터 안정성 Buffer > Builder

        // StringBuffer
        // 속도 저하 안함, 메모리 더 효율적으로 사용
        StringBuffer sf = new StringBuffer("JAVA");
        sf.append("_8");
        StringBuilder sf2 = new StringBuilder("JAVA");
        sf2.append("_8_1");
        System.out.println(sf + ", " + sf2);
    }
}

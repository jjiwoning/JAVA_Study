package Constructor_Study;

public class Main {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        Constructor_Study newClass1 = new Constructor_Study();
        Constructor_Study newClass2 = new Constructor_Study(4);
        Constructor_Study newClass3 = new Constructor_Study(a);
        newClass3.printArray();
        newClass1 = new Constructor_Study();
        //객체가 GC에 의해서 메모리에서 제거가 될 때 finalize() 매서가 호출이 된다.
        //아래의 코드는 GC가 가급적 빨리 작동하도록 요구하는 코드이다. -> 자동적으로 해줘서 사용은 자주 안함
        System.gc();
    }
}

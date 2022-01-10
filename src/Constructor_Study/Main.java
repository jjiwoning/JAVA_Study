package Constructor_Study;

public class Main {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        Constructor_Study newClass1 = new Constructor_Study();
        Constructor_Study newClass2 = new Constructor_Study(4);
        Constructor_Study newClass3 = new Constructor_Study(a);
        newClass3.printArray();
    }
}

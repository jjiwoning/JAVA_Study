package Calculator;

public class Calculator {

    int add(int i, int j){
        return i + j;
    }

    int subtract(int i, int j){
        return i - j;
    }

    int multiply(int i, int j){
        return i * j;
    }

    int divide(int i, int j){
        return i / j;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(6, 3));
        System.out.println(calculator.subtract(6, 3));
        System.out.println(calculator.multiply(6, 3));
        System.out.println(calculator.divide(6, 3));
    }
}

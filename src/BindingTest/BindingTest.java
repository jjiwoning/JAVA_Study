package BindingTest;

public class BindingTest {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();

        System.out.println(parent.x);
        parent.method1();

        System.out.println(child.x);
        child.method1();
    }
}

class Parent {
    int x = 100;

    void method1() {
        System.out.println("call parent");
    }
}

class Child extends Parent {
    int x = 200;

    void method1() {
        System.out.println("call child");
    }

    void method2() {
        System.out.println("call child method2");
    }
}
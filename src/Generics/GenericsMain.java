package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Hello");
        System.out.println("box.getItem() = " + box.getItem());

        Box<Integer> box1 = new Box<>();
        box1.setItem(1234);
        System.out.println("box1.getItem() = " + box1.getItem());

        Box<Object> box2 = new Box<>();
        box2.setItem("abc");
        List<String> list = new ArrayList<>();
//        box2.setItemList(list); -> 에러 발생 Object와 String이 타입이 다름

        List<Object> objectList = new ArrayList<>();
    }
}

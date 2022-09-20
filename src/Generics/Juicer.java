package Generics;

public class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        return new Juice(box);
    }

    static <T extends Fruit> Juice makeJuice1(FruitBox<T> box) {
        return new Juice(box);
    }

    Juice makeJuice2(FruitBox<Fruit> box) {
        return new Juice(box);
    }

    public static void main(String[] args) {
        makeJuice(new FruitBox<Fruit>());
        makeJuice(new FruitBox<Apple>());
        makeJuice1(new FruitBox<Apple>());
        Juicer.<Apple>makeJuice1(new FruitBox<Apple>());
    }
}

class Juice{
    public Juice(FruitBox<? extends Fruit> box) {
        System.out.println("주스 완성");
    }
}
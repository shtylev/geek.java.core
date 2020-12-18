package geekbrains;

import model.Apple;
import model.Box;
import model.Fruit;
import model.Orange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box boxApple = new Box();
        boxApple.addFruit(apple1);
        boxApple.addFruit(apple2);
        boxApple.addFruit(orange1);

        Box boxApple2 = new Box(2);
        boxApple2.addFruit(apple3);
        boxApple2.addFruit(apple4);

        Box boxOrange = new Box(3);
        boxOrange.addFruit(orange1);
        boxOrange.addFruit(orange2);
        boxOrange.addFruit(orange3);

        System.out.printf("Количество яблок - %d\n", boxApple.getFruits().size());
        System.out.println(boxApple.getWeight());
        System.out.println(boxApple.compare(boxOrange));
        boxApple.putInto(boxApple2);
        System.out.printf("Количество яблок - %d\n", boxApple.getFruits().size());
        System.out.printf("Количество яблок2 - %d\n", boxApple2.getFruits().size());
        boxApple2.putInto(boxOrange);
    }
}

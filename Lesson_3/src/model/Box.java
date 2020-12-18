package model;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public Box(int countFruits) {
        fruits = new ArrayList<>(countFruits);
    }

    public void addFruit(T fruit) {
        if (fruits.size() == 0)
            fruits.add(fruit);
        else {
            if (fruits.get(0).getClass().getName() == fruit.getClass().getName())
                fruits.add(fruit);
            else {
                System.out.println("В коробке находятся другие фрукты");
                return;
            }
        }
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.size() == 0) {
            return 0f;
        } else {
            return fruits.get(0).getWeight() * fruits.size();
        }
    }

    public boolean compare(Box<T> box) {
        return fruits.size() == box.fruits.size();
    }

    public void putInto(Box<T> box) {
        if (fruits.size() == 0) {
            System.out.println("Вы пытаетесь пересыпать пустую коробку");
            return;
        }

        if (box.fruits.size() != 0) {
            if (fruits.get(0).getClass().getName() == box.fruits.get(0).getClass().getName()) {
                box.fruits.addAll(fruits);
                fruits.clear();
            } else
                System.out.println("Вы пытаетесь пересыпать фрукты в коробку с другими фруктами");
        }
    }
}

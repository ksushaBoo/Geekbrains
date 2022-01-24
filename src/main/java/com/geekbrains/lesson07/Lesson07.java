package com.geekbrains.lesson07;

public class Lesson07 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурчик", 10);
        Cat cat2 = new Cat("Барсик", 15);
        Cat cat3 = new Cat("Барсик2.0", 25);
        Cat cat4 = new Cat("Милаш", 5);
        Cat cat5 = new Cat("Толстяк", 100);

        Plate plate = new Plate(100);

        Cat[] cats = new Cat[5];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;
        cats[4] = cat5;

        for (Cat catsInFor : cats) {
            if (!catsInFor.getIsNotHungry()) {
                catsInFor.eat(plate);
                System.out.println("В тарелке осталось еды: " + plate.info());
            }

        }
    }
}

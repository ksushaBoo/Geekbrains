package com.geekbrains.lesson06;

public class Lesson06 {

    public static int COUNT = 5;

    public static void main(String[] args) {

        Cat cat1 = new Cat(4, "Мурчик", "Рыжий");
        Cat cat2 = new Cat(3, "Бобик", "Разноцветный");
        Dog dog1 = new Dog(4, "Питька", "Серый");
        Dog dog2 = new Dog(4, "Филя", "Бежевый");

        cat1.run(100);
        cat1.swim(100);
        cat2.run(250);
        cat2.run(200);
        dog1.run(300);
        dog1.swim(5);
        dog2.run(500);
        dog2.swim(15);
        dog2.run(900);

        Animal[] animals = new Animal[COUNT];
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        animals[3] = dog2;
        animals[4] = new Cat(4, "Красавчик", "Розовый");

        for (Animal animalInFor : animals) {
            animalInFor.info();
            System.out.println("_______________________");
        }

        System.out.println("Количество созданных объектов = " + cat1.count);
    }
}

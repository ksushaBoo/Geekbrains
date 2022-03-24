package com.geekbrains.lesson06;

public class Cat extends Animal {

    protected boolean isCute;

    public Cat(int numberOfPaws, String name, String color) {
        super(numberOfPaws, name, color);
        this.isCute = true;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики не плавают!");
    }

    @Override
    public void run(int distance) {
        if (distance <= 200)
            super.run(distance);
        else
            System.out.println(this.getName() + " пробежал только 200 метров из " + distance + " больше котики не умеют");
    }

    @Override
    public void info() {
        super.info();
        if (isCute)
            System.out.println("я милашка");
    }
}

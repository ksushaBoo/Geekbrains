package com.geekbrains.lesson06;

public class Dog extends Animal {

    protected boolean isLoud;

    public Dog(int numberOfPaws, String name, String color) {
        super(numberOfPaws, name, color);
        this.isLoud = true;
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10)
            super.swim(distance);
        else
            System.out.println(this.getName() + " проплыл только 10 метров из " + distance + " больше песики не умеют");
    }

    @Override
    public void run(int distance) {
        if (distance <= 500)
            super.run(distance);
        else
            System.out.println(this.getName() + " проплыл только 500 метров из " + distance + " больше песики не умеют");
    }

    @Override
    public void info() {
        super.info();
        if (isLoud)
            System.out.println("Я очень громко лаю!");
    }
}

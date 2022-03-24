package com.geekbrains.lesson07;

public class Plate {

    private int food;

    public Plate(int food) {
        if (food > 0)
            this.food = food;
        else System.out.println("Использовано неправильное количество еды");
    }

    public void decreaseFood(int n, Cat cat) {

        while ((food - n) <= 0) {
            this.addFood(n);
        }
        if ((food - n) >= 0) {
            food -= n;
        }
    }

    public int info() {
        return this.getFood();
    }

    public void addFood(int food) {
        if (food > 0)
            this.food += food;
        else System.out.println("Использовано неправильное количество еды");
    }

    public int getFood() {
        return food;
    }
}

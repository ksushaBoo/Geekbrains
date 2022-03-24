package com.geekbrains.lesson07;

public class Cat {

    private String name;
    private int appetite;
    private boolean isNotHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isNotHungry = false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite, this);
        this.isNotHungry = true;
        System.out.println("Котик " + this.getName() + " покушал");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getIsNotHungry() {
        return isNotHungry;
    }

    public void setNotHungry(boolean Hungry) {
        isNotHungry = Hungry;
    }
}

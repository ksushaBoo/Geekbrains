package com.geekbrains.lesson06;

public abstract class Animal {

    protected int numberOfPaws;
    protected String name;
    protected String color;
    protected static int count = 0;

    public Animal(int numberOfPaws, String name, String color) {
        this.numberOfPaws = numberOfPaws;
        this.name = name;
        this.color = color;
        count++;
    }

    public void run(int distance) {

        System.out.println(this.getName() + " пробежал дистанцию в " + distance + " метров");
    }

    public void swim(int distance) {

        System.out.println(this.getName() + " проплыл дистанцию в " + distance + " метров");
    }

    public void info() {
        System.out.println("Меня зовут " + this.getName());
        System.out.println("Я " + this.getColor());
        System.out.println("У меня " + this.getNumberOfPaws() + " лапки");
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

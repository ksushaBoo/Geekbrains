package com.geekbrains.lesson05;

public class Employee {

    private String fio;
    private String position;
    private String email;
    private String mobileNumber;
    private int salary;
    private int age;

    public void info() {
        System.out.println("ФИО: " + getFio());
        System.out.println("Должность: " + getPosition());
        System.out.println("Email: " + getEmail());
        System.out.println("Телефон: " + getMobileNumber());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Возраст: " + getAge());
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Employee(String fio, String position, String email, String mobileNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }
}

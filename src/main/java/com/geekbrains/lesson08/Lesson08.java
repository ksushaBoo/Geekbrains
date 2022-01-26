package com.geekbrains.lesson08;

import javax.swing.*;

public class Lesson08 extends JFrame {
    public Lesson08() {
        setTitle("Calculator");
        getContentPane().add(new CalculationWindow());
    }

    public static void main(String[] args) {
        Lesson08 frame = new Lesson08();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 200, 650, 550);
        frame.setVisible(true);
    }
}

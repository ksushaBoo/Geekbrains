package com.geekbrains.lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationWindow extends JPanel {

    private static JLabel display;
    private JPanel panel;
    private float result;
    private String lastCommand;
    private static boolean start;

    public CalculationWindow() {
        result = 0;
        lastCommand = "=";
        start = true;
        setLayout(new BorderLayout());
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] operations = {'+', '-', '*', '/', '='};
        display = new JLabel("0");
        add(display, BorderLayout.NORTH);
        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();
        ActionListener clear = new ClearAction();
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        for (int i = 0; i < 10; i++) {
            addButton(String.valueOf(numbers[i]), insert);
        }
        for (int i = 0; i < 5; i++) {
            addButton(String.valueOf(operations[i]), command);
        }
        addButton("C", clear);
        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    static class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    class ClearAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            display.setText("0");
            result = 0;
        }
    }

    class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String command = evt.getActionCommand();
            if (start) {
                lastCommand = command;
            } else {
                calculate(Float.parseFloat(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }

    public void calculate(float x) {
        Calculator calculator = new Calculator();
        switch (lastCommand) {
            case "+":
                result = calculator.sumOperation(result, x);
                break;
            case "-":
                result = calculator.minusOperation(result, x);
                break;
            case "*":
                result = calculator.multiplyOperation(result, x);
                break;
            case "/":
                result = calculator.devisionOperation(result, x);
                break;
            case "=":
                result = x;
                break;
        }
        display.setText("" + result);
    }
}

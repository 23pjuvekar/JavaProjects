package com.pratham;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

    private JFrame frame;
    private JTextField display;


    public UI() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(250, 400  );
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int buttonWidth = 70;
        int buttonHeight = 70;
        int xValueColumn1 = 0;
        int xValueColumn2 = 60;
        int xValueColumn3 = 120;
        int xValueColumn4 = 180;
        int yValueRow1 = 70;
        int yValueRow2 = 130;
        int yValueRow3 = 190;
        int yValueRow4 = 250;
        int yValueRow5 = 310;



        addButton("7", xValueColumn1, yValueRow1, buttonWidth, buttonHeight);
        addButton("8", xValueColumn2, yValueRow1, buttonWidth, buttonHeight);
        addButton("9", xValueColumn3, yValueRow1, buttonWidth, buttonHeight);
        addButton("4", xValueColumn1, yValueRow2, buttonWidth, buttonHeight);
        addButton("5", xValueColumn2, yValueRow2, buttonWidth, buttonHeight);
        addButton("6", xValueColumn3, yValueRow2, buttonWidth, buttonHeight);
        addButton("1", xValueColumn1, yValueRow3, buttonWidth, buttonHeight);
        addButton("2", xValueColumn2, yValueRow3, buttonWidth, buttonHeight);
        addButton("3", xValueColumn3, yValueRow3, buttonWidth, buttonHeight);
        addButton("0", xValueColumn1, yValueRow4, buttonWidth, buttonHeight);
        addButton(".", xValueColumn2, yValueRow4, buttonWidth, buttonHeight);
        addButton("+/-", xValueColumn3, yValueRow4, buttonWidth, buttonHeight);
        addButton("+", xValueColumn4, yValueRow1, buttonWidth, buttonHeight);
        addButton("-", xValueColumn4, yValueRow2, buttonWidth, buttonHeight);
        addButton("*", xValueColumn4, yValueRow3, buttonWidth, buttonHeight);
        addButton("/", xValueColumn4, yValueRow4, buttonWidth, buttonHeight);
        addButton("=", xValueColumn1, yValueRow5, 250, buttonHeight);
        addDisplay(buttonHeight);
    }

    private double num1 = 0;
    private double num2 = 0;
    private String operator = null;
    private double answer;

    private double calculateValue() {
        if ( operator == null ) {
            answer = num1;
        }
        else if ( operator.equals("+")) {
            answer = num1+num2;
        }
        else if ( operator.equals("-")) {
            answer = num1-num2;
        }
        else if ( operator.equals("*")) {
            answer = num1*num2;
        }
        else if ( operator.equals("/")) {
            answer = num1/num2;
        }
        return 0;
    }

    private void printState() {
        System.out.println ("num1=" + num1);
        System.out.println ("num2=" + num2);
        System.out.println ("operator=" + operator==null?"null":operator);
    }

    public void addButton(String ButtonText, int xCoordinate, int yCoordinate, int width, int height) {

        JButton button = new JButton(ButtonText);
        button.setBounds(xCoordinate, yCoordinate, width, height);
        frame.add(button);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String value = actionEvent.getActionCommand();
                String cur_display = display.getText();

                if (isNumber(value) == true){

                    if ( operator != null ) {
                        display.setText(value);
                    }

                    if (cur_display.equals("0")){
                        display.setText(value);
                    } else {
                        display.setText(cur_display+value);
                    }

                    if (operator == null) {
                        num1 = Double.parseDouble(display.getText());
                    } else {
                        num2 = Double.parseDouble(display.getText());
                    }
                    printState();

                }
                else if (isOperation(value) == true){
                    operator = value;
                    printState();
                    display.setText("");
                }
                else if ( value.equals("=") ) {
                    calculateValue();
                    String Answer = String.valueOf(answer);
                    display.setText(Answer);
                    num1 = 0;
                    num2 = 0;
                    answer = 0;
                    operator = null;
                }
            }

        });
    }

    private boolean isNumber(String val) {
        if (val == null) {
            return false;
        }
        try {
            Integer.parseInt(val);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private boolean isOperation(String val) {
        if ( val.equals("+") ) {
            return true;
        }
        if ( val.equals("-") ) {
            return true;
        }
        if ( val.equals("*") ) {
            return true;
        }
        if ( val.equals("/") ) {
            return true;
        }
        return false;
    }

    private void addDisplay(int buttonHeight){
        display = new JTextField("");
        display.setBounds(0,0,250, buttonHeight);
        display.setVisible(true);
        display.setEditable(false);
        frame.add(display);
    }
}

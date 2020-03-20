package com.pratham;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI {

    private JFrame frame;

    public UI() {
        frame = new JFrame("Calculator");
        frame.setVisible(true);
        frame.setSize(400, 500  );
        frame.setLayout(null);

        int buttonWidth = 100;
        int buttonHeight = 100;

        addButton("7", 10, 10, buttonWidth, buttonHeight);
        addButton("8", 120, 10, buttonWidth, buttonHeight);
        addButton("9", 230, 10, buttonWidth, buttonHeight);
        addButton("4", 10, 120, buttonWidth, buttonHeight);
        addButton("5", 120, 120, buttonWidth, buttonHeight);
        addButton("6", 230, 120, buttonWidth, buttonHeight);
        addButton("1", 10, 230, buttonWidth, buttonHeight);
        addButton("2", 120, 230, buttonWidth, buttonHeight);
        addButton("3", 230, 230, buttonWidth, buttonHeight);
        addButton("0", 10, 340, buttonWidth, buttonHeight);
        addButton(".", 120, 340, buttonWidth, buttonHeight);
        addButton("+/-", 230, 340, buttonWidth, buttonHeight);
    }

    public void addButton(String ButtonText, int xCoordinate, int yCoordinate, int width, int height){
        JButton button = new JButton(ButtonText);
        button.setBounds(xCoordinate, yCoordinate, width, height);
        frame.add(button);
    }
}

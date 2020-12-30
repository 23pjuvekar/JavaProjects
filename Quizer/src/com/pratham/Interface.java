package com.pratham;
import javax.swing.*;
import java.awt.*;

public class Interface {
    //Setting up basic JFrame variable
    JFrame frame = new JFrame();

    //Method for creating basic frame
    public void createFrame(){
        frame.setVisible(true);
        frame.setSize(1300, 850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
    }

    // Method for creating basic button
    public void createButton(String ButtonText, int Xcordinate, int Ycordinate, int length, int width){
        JButton button = new JButton(ButtonText);
        button.setBounds(Xcordinate, Ycordinate, width, length);
        button.setVisible(true);
        frame.add(button);

    }

    //Method for creating basic labels
    public void createLabel(String LabelText, int Xcordinate, int Ycordinate, int length, int width){
        JLabel label = new JLabel(LabelText);
        label.setBounds(Xcordinate, Ycordinate, width, length);
        label.setVisible(true);
        frame.add(label);
    }

    //Method for creating basic display
    public void createDisplay(String DisplayText, int Xcordinate, int Ycordinate, int length, int width){
        JTextField display = new JTextField(DisplayText);
        display.setBounds(Xcordinate, Ycordinate, width, length);
        display.setVisible(true);
        frame.add(display);

    }

    //Method for creating action listener
    public void createActionListener(){
        
    }
}

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
    }

    // Method for creating basic button
    public void createButton(String ButtonText, int Xcordinate, int Ycordinate, int length, int width){
        JButton button = new JButton(ButtonText);
        button.setVisible(true);
        button.setBounds(Xcordinate, Ycordinate, width, length);
        frame.add(button);
    }

    //Method for creating basic labels
    public void createLabel(String LabelText, int Xcordinate, int Ycordinate, int length, int width){
        JLabel label = new JLabel(LabelText);
        label.setVisible(true);
        label.setBounds(Xcordinate, Ycordinate, width, length);
        frame.add(label);
    }

    //Method for creating basic display
    public void createDisplay(String DisplayText, int Xcordinate, int Ycordinate, int length, int width){
        JTextField display = new JTextField(DisplayText);
        display.setVisible(true);
        display.setBounds(Xcordinate, Ycordinate, width, length);
        frame.add(display);

    //Method for packing elements together
    //public static void packElement(){
        
     //   }
    }
}

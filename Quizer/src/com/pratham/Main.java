package com.pratham;
import javax.swing.*;
import java.awt.*;

public class Main extends Interface {

    public static void main(String[] args) {

        // Setting up variables


        // Creating instance of new java object
        Interface object = new Interface();

        // Creates new JFrame Window
        object.createFrame();

        // Creates Login Button
        object.createButton("Login",500,450,100,300);

        //Creates Login Entering Textbook
        object.createLabel("Enter Username:", 500, 350, 30,150);
        object.createLabel("Enter Password:", 500,400,30,150);
        object.createDisplay("", 600, 350, 30,200);
        object.createDisplay("", 600, 400, 30,200);






    }

}

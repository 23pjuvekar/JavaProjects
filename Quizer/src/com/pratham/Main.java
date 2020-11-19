package com.pratham;
import javax.swing.*;

public class Main extends Interface {

    public static void main(String[] args) {

        // Setting up variables


        // Creating instance of new java object
        Interface object = new Interface();

        // Creates new JFrame Window
        object.createFrame();

        // Creates Main header label
        object.createButton("Login", 0, 10, 10, 10 );
        object.createButton("New",0,0,5,5);


    }

}

package com.pratham;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     UI calcUi = new UI();

/*
        // Code for setting up the Addition Button
        String ButtonText = "+";
        int xCoordinate = 100;
        int yCoordinate = 200;
        int width = 100;
        int height = 200;
        int FrameWidth = 400;
        int FrameHeight = 400;
        UI.Buttons(ButtonText, xCoordinate, yCoordinate, width, height, FrameWidth, FrameHeight);

        // Code for setting up the Subtraction Button
        ButtonText = "-";
        xCoordinate = 1000;
        yCoordinate = 200;
        width = 100;
        height = 200;
        FrameWidth = 400;
        FrameHeight = 400;
        UI.Buttons(ButtonText, xCoordinate, yCoordinate, width, height, FrameWidth, FrameHeight);

        // Base code for setting up variables and getting the values for the variables
        double answer, fNum, sNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number.");
        fNum = scan.nextDouble();
        System.out.println("Enter the second number");
        sNum = scan.nextDouble();
        System.out.println("Enter the operator");
        char operator = scan.next().charAt(0);

        // if statements used to determine which method to use
        if (operator == '+' ){
        addition(fNum, sNum);
        } else if (operator == '-'){
            subtraction(fNum, sNum);
        } else if (operator == '*'){
            multiplication(fNum, sNum);
        } else if (operator == '/'){
            division(fNum, sNum);
        } else if ((operator != '+') || (operator != '-') || (operator != '*') || (operator != '/') ) {
            System.out.println("Error enter a new operator");
        }
 */
    }

    static void addition(double fNum, double sNum){
        double answer = fNum + sNum;
        System.out.println(answer);
    }
    static void subtraction (double fNum, double sNum){
        double answer = fNum - sNum;
        System.out.println(answer);
    }
    static void multiplication (double fNum, double sNum){
        double answer = fNum * sNum;
        System.out.println(answer);
    }
    static void division (double fNum, double sNum){
        double answer = fNum/sNum;
        System.out.println(answer);
    }
}

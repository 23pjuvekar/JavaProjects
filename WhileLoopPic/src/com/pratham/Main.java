package com.pratham;

//Pratham Juvekar
//November 18th, 2020
//Number Squarer calculator
//Takes in two number and outputs all the squares between all the numbers

import java.awt.*;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1; //Number 1
        double num2; //Number 2
        double count = 0; //Count for while loop
        double maxNum = 0; //Stores the larger of the two nums
        char choice; //Choice for repeating program

        do {

            //Takes in both of the number
            System.out.println("Enter the first number");
            num1 = scan.nextDouble();
            System.out.println("Enter the second number");
            num2 = scan.nextDouble();

            //Find the smaller of the two numbers
            if (num1 < num2){
                count = num1;
                maxNum = num2;
            } else if (num2 < num1){
                count = num2;
                maxNum = num1;
            }

            while (count <= maxNum){
                System.out.println("Square of " + count + " is " + Math.pow(count, 2));
                System.out.println("Cube of " + count + " is " + Math.pow(count, 3));
                count ++;
            }


            System.out.println("Enter Y to continue program or Enter N to stop");
            choice = scan.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');
    }
}

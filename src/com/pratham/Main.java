package com.pratham;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char choice; //Choice for running program again
        double count = 0; //Count for while loop
        double limit; //Limit for while loop

        do{
            System.out.println("Enter the limit");
            limit = scan.nextDouble();


            while(count <= limit){
                //Enter code that you want to keep running
                count++;
            }


            System.out.println("Enter your Y to continue or N to stop");
            choice = scan.nextLine().charAt(0);

        } while (choice == 'Y' || choice == 'y');
    }
}

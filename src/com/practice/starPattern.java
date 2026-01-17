package com.practice;
import java.util.Scanner;
public class starPattern {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    //Take the input from user,
    System.out.println("please enter any number");
    int userInput = scanner.nextInt();

    // call the method

    generateStar(userInput);

    scanner.close();


    }

    public static void generateStar(int n){

        for(int i= 1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }

    }
    
}

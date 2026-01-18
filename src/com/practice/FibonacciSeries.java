package com.practice;
import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[]args){

        // scanner class object

        Scanner scanner = new Scanner(System.in);

        // get the user input

        System.out.println(" Please enter a number to generate the fibonacci series");

        int inputNumber = scanner.nextInt();

        // call the generatefibonacci method

        generateFibonacci(inputNumber);


        scanner.close();



    }

    public static void generateFibonacci(int n){

        int firstNumber = 0, secondNumber = 1;

        for(int i = 1; i<=n; i++){

            System.out.println(firstNumber + " ");

            int nextNumber = firstNumber + secondNumber;

            firstNumber = secondNumber;

            secondNumber = nextNumber;

        }

    }

}

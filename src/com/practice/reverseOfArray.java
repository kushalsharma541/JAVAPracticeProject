package com.practice; 
import java.util.Scanner;
public class reverseOfArray {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a length of array");

        int number = scanner.nextInt();

        int[] array = new int[number];

        System.out.println("Please enter the " + number + " arrays elements");

        for(int i=0; i<number; i++){
            
            array[i] = scanner.nextInt();
        }
            // Reverse the array
        reverseArray(array);

        // Display the reversed array
        System.out.print("Reversed array: ");
        for (int num : array) {
            
            System.out.print(num + " ");
            }
        scanner.close();
    }
    
    public static void reverseArray(int[] array) {
        int left = 0; // Starting index
        int right = array.length - 1; // Ending index

        while (left < right) {
            // Swap elements
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }
    
}

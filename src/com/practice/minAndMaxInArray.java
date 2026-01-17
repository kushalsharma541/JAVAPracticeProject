package com.practice;
import java.util.Scanner;
public class minAndMaxInArray {


    @SuppressWarnings("resource")
    public static void main(String[]args){
    

   Scanner scanner = new Scanner(System.in);

   System.out.println("Please enter a number of your choice");
   int number = scanner.nextInt();

    int[] newArray = new int[number]; //initialize the array

    System.out.println("Pleae enter " + number + "elements to the array");

    for(int i=0; i<number; i++){
        
        newArray[i] = scanner.nextInt();

    }
    int maximum = maxArrayValue(newArray);
    int minimum = minArrayvalue(newArray);
    System.out.println("maximum value =" + maximum);

    
    System.out.println("minimum value =" + minimum);
}


    public static int maxArrayValue(int[]arr){

        int max = arr[0];

        for(int num: arr){

            if(num>max){

                max = num;
            }
            
        }
        return max;
    }

    public static int minArrayvalue(int[]arr){

        int minValue = arr[0];

        for(int num :arr){

            if(num< minValue ){
                
                minValue = num;
            }
        }
        return minValue;
    }
 
}
    


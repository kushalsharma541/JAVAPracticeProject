
package com.practice;
import java.util.Scanner;
public class reverseString {

@SuppressWarnings("ConvertToTryWithResources")
public static void main (String[]args){

    // create an object from scanner class

    Scanner scanner = new Scanner(System.in);

    // get the input from the user in form of String

    System.out.println("Please enter a String to reversed");

    String input = scanner.nextLine();

    // call the method to reverse the input String

   String finalOutputString = ReverseString(input);

   System.out.println("Here is your reversed string" + " " + finalOutputString);

   // closing the scanner class
   scanner.close();
    
}

public static String ReverseString(String str){
    

    StringBuilder reversedString = new StringBuilder();

    

    for(int i= str.length() - 1; i>=0; i--){

        reversedString.append(str.charAt(i));

    }

    return reversedString.toString();

}
    
}

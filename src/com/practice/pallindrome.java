package com.practice;
import java.util.Scanner;
public class pallindrome {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String to check Palindrome ");

        String inputStr = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(inputStr);

        if(isPalindrome){

            System.out.println("string is Palindrome");
        }else{

            System.out.println("string is not Palindrome");
        }

        scanner.close();

    }

    public static boolean checkPalindrome(String str){

        // replace all spaces and convert into lowercare

        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;

        int right= str.length()-1;

        while(left<right){

            if(str.charAt(left) != str.charAt(right)){

                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}

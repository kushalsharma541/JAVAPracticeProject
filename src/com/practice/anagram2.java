package com.practice;
import java.util.Arrays;
import java.util.Scanner;

public class anagram2 {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string");
        String value1 = scanner.nextLine();

        System.out.println("Please enter the second string");

        String value2 = scanner.nextLine();

        boolean isAnagram = checkAnagram(value1, value2);

        if(isAnagram){

            System.out.println("both the input strings are Anagram");
        }else{
            System.out.println("both the input strings are not Anagram");
        }
        scanner.close();

    }

    public static boolean checkAnagram (String str1, String str2){


        str1 = str1.replaceAll("\\s+", "").toLowerCase();

        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if(str1.length() != str2.length()){
            return  false;
        }

        char[] charArray1 = str1.toCharArray();

        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);

        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
        
    }
    
}

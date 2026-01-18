package com.practice;
import java.util.Arrays;

import java.util.Scanner;

public class AnagramChecker {
    
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the first string of your choice:");

    String firstString = scanner.nextLine();
    System.out.println("Please enter the second string of your choice:");
    String secondString = scanner.nextLine();

    boolean result = Anagramchecker(firstString, secondString);
    if(result){

        System.out.println(firstString + " and " + secondString + " are anagrams.");
    }else{
        System.out.println(firstString + " and " + secondString + " are not anagrams.");
    }
scanner.close();
}

public static boolean Anagramchecker(String str1,  String str2){

    str1 =str1.replaceAll("\\s+", "");
    str2 =str2.replaceAll("\\s+", "");

    if (str1.length() != str2.length()) {
        return false;
    }

    char[] arr1 = str1.toLowerCase().toCharArray();
    char[] arr2 = str2.toLowerCase().toCharArray();

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    return Arrays.equals(arr1, arr2);
}

}

/* public class AnagramChecker{
    public static void main(string[]args){
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first string of your choice:");
    String firstString = scanner.nextLine();
    System.out.println("Please enter the second string of your choice:");
    String secondString = scanner.nextLine();
    boolean result = AnagramChecker(firstString, secondString);
    if(result){
        System.out.println(firstString + " and " + secondString + " are anagrams.");}
        else{
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
}

}
public static boolean Anagramchecker(String str1, String str2){

str1 = str1.replaceall("\\s+", "").toLowercase();
str2 = str2.replaceall("\\s+", "").toLowercase();

if(str1.Legth() != str2.Length()){
 return false;
 }

 char[] arr1 = str1,tocharArray();
 char[] arr2 =str2.tocharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

return Arrays.equals(arr1,arr2);
}
}  */
package com.practice;
import java.util.Scanner;
public class CompressedString {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        // input from user

        System.out.println("Please input a String");

        String inputString = scanner.nextLine();

        String finalOutput = compresedString(inputString);

        System.out.println(finalOutput);

        scanner.close();


    }
    public static String compresedString(String str){

        StringBuilder compressed = new StringBuilder();

        // str = str.replaceAll("\\s+", "").toLowerCase();

        int count = 1;

        for(int i=0; i<str.length(); i++){

            if(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){

                count++;

            }else{

                compressed.append(str.charAt(i));
                compressed.append(count);

                count =1;
            }
        }return compressed.toString();
    }
    
}

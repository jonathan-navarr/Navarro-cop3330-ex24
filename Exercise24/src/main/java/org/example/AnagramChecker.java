package org.example;
import java.util.Scanner;
import java.util.Arrays;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonathan Navarro
 */
public class AnagramChecker {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String firstWord, secondWord;
        System.out.println("Enter two strings and I'll tell you if they are anagrams");

        System.out.print("Enter the first string: ");
        firstWord = scnr.nextLine();

        System.out.print("Enter the second string: ");
        secondWord = scnr.nextLine();

        if(isAnagram(firstWord, secondWord))
        {
            System.out.print("\"" + firstWord + "\" and \"" + secondWord + "\" are anagrams");
        }
        else
        {
            System.out.print("\"" + firstWord + "\" and \"" + secondWord + "\" are not anagrams");
        }
    }
    public static boolean isAnagram(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        }
        else
        {
            char[] array1 = firstWord.toLowerCase().toCharArray();
            char[] array2 = secondWord.toLowerCase().toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            return (Arrays.equals(array1, array2));
        }
    }

}

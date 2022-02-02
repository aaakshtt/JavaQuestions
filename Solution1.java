package com.company;
import java.util.*;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your sentence");
        String userinput = sc.nextLine();
        String upper_case_line = "";
        Scanner linescan = new Scanner(userinput);   //Take input from user and make it into a object
        while (linescan.hasNext()) {                //Check if scanned line has next word
            String word = linescan.next();          //Position the next word into a string
            //System.out.println(word);               //Print every word of line
            //System.out.println(word.charAt(0));     //Will print the letter which is to be made capital
            //upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) +" " ;  //Update the loop and take next word
            upper_case_line += Character.toUpperCase(word.charAt(0)) +word.substring(1) +" ";


        }
        System.out.println(upper_case_line);        //Will print the value stored in upper_case_line when loop ends

    }
}

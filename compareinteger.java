//Write a Java program that accepts three integers from the user and return true if two or more of them (integers ) have the same rightmost digit. The integers are non-negative

package com.company;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int i1 = sc.nextInt();
        String s1 = String.valueOf(i1);
        String s11 = s1;
        int i2 = sc.nextInt();
        String s2 = String.valueOf(i2);
        String s22 = s2;
        int i3 = sc.nextInt();
        String s3 = String.valueOf(i3);
        String s33 = s3;                                //Store in a string temproarily
        Character rt = s11.charAt(s11.length()-1);      //get the last numeber
        Character rt2 = s22.charAt(s22.length()-1);
        Character rt3 = s33.charAt(s33.length()-1);
        if (rt == rt2 && rt2 == rt3) {                  //Compare two integers
            System.out.println("Two of them have same rightmost value");
        }
        else if (rt == rt2 ){
            System.out.println("Rightmost digit is equal");
        }
        else if ( rt2 == rt3 ){
            System.out.println("Second Rightmost digit is equal");
        }
        else if (rt == rt3){
            System.out.println("Thirdd Rightmost digit is equal");
        }
    }
}



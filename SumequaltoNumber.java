//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
package com.company;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter number 3");
        int num3 = sc.nextInt();
        System.out.println(sumoftwo(num1, num2, num3));
    }
    public static boolean sumoftwo(int p,int q,int r){
        return (q >p && r>q);
    }
}




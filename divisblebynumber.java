//Write a Java program to find the number of values in a given range divisible by a given value.

package com.company;
import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        int x =4;                         //There is 1 number divisible by 3 from 0 to 4
        int y =100;                       //There are 33 numbers divisible by 3 from 0 to 100
        int p =3;
        System.out.println(result(x,y,p));
    }
    public static int result(int x,int y,int p ){
        if (x%p == 0)
            return (y/p - x/p + 1);      //We add the exisiting number to get the numbers in range
        else {
            return (y / p - x / p);     //We subtract and get the answer for the range
        }
    }
}



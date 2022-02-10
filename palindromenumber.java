package DataAlgo;

import java.util.*;
import java.io.*;



class Solution
{
    public static void main(String []args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input your number");
        int a =sc.nextInt();
        int temp = a;             			//Store value in a temproary number
        int rem = 0;					//Intialize value of remainder as zero
        int rev = 0;					// Create a 
        while (temp != 0){
            rem = temp%10;                              //Returns modulus of remainder
            rev = rev*10 +rem;                          //Stores value ofr number to be reversed and increments remainder
            temp = temp/10;                             //Removes a single decimal
        }
        System.out.println(rev);
        if (rev == a){
            System.out.println("palindrome number");
        }       
        System.out.println(121%10);			//Returns 1
        System.out.println(121/10);			//Returns 12
    }
}

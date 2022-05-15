package com.akshat;
import java.util.*;
import java.util.Arrays;
public class problems {
	//Function to swap values of 2 numbers
	//Without creating temp vairable
	
	static void swapvalueswithoutusingthirdnumber(int m , int n) {
		//DIfference of second from first is stored in the first variable
		m = m - n;
		n = m + n ;
		m = n - m;
		System.out.println("Value of m is " + m
                + " and Value of n is " + n);
	}
	
	
	public static void main(String args[]) 
	{
		int m =9;int n =5;
		swapvalueswithoutusingthirdnumber(m,n);
}
	}



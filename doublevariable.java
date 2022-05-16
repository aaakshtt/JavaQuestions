//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
package com.akshat;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class problems {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		System.out.println("Enter the second number");
		double b = sc.nextDouble();
		if(0<a &&a<1 && 0<b&&b<1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		}
	}
	

	



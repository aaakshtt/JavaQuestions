//Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise
package com.akshat;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class problems {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a");
		int a = sc.nextInt();
		System.out.println("Please enter b");
		int b = sc.nextInt();
		System.out.println("Please enter c");
		int c = sc.nextInt();
		System.out.println("Please enter d");
		int d = sc.nextInt();
		if(a==b &&b==c &&c==d && d==a) {
			System.out.println("All four integers are equal");
		}
		else {
			System.out.println("They are not equal");
		}
	}
	}
	
	



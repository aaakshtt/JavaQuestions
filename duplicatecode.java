//Write a Java program to find the duplicate values of an array of integer values.
  
  package com.akshat;

import java.util.Arrays;
public class problems {
	public static void main(String args[]) 
	{
		int [] my_array = {1,2,3,4,5,6,5,6};
		
		for(int i = 0; i < my_array.length-1 ; i++)
		{
			for(int j = i + 1 ; j<my_array.length ; j++)
			{
				if((my_array[i] == my_array[j]) && (i!=j))
				{
					System.out.println("Duplicate elemnt is " + my_array[j]);
				}
			}
		}
		
	}
}



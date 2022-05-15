package com.akshat;
import java.util.*;
import java.util.Arrays;
//For creating a complex numbers, we will pass imaginary numbers and real numbers as parameters for constructors.

class ComplexNumber{
	//variables to hold imaginary and real numbers
	int real , imagi;
	
	//COnstructor which will be used while creating complex number
	public ComplexNumber(int r , int i) {
		this.real = r;
		this.imagi = i;
	}
	//Function to print real number
	public void showc() {
		System.out.println(this.real +" +i  " + this.imagi );
	}
	//we will implement this function for addition
	
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		//Creating blank complex number to add result
		ComplexNumber res = new ComplexNumber(0,0);
		
		//adding real parts of both complex numbers
		res.real = n1.real + n2.real;
		
		//Adding imaginary parts
		res.imagi = n1.imagi + n2.imagi;
		
		return res;
		
	}
	public static void main(String arg[]) {
		//creatng two complex number
		ComplexNumber c1= new ComplexNumber(4,5);
		ComplexNumber c2 = new ComplexNumber(10,5);
		//printing complex numbers
		System.out.print("First complex number : " );
		c1.showc();
		System.out.print("\nSecond Complex number: ");
        c2.showc();
  
        // calling add() to perform addition
        ComplexNumber res = add(c1, c2);
  
        // displaying addition
        System.out.println("\nAddition is :");
        res.showc();
		
	}
}


package akshat2;
import java.lang.Math;
import java.lang.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
	
    public static void main(String[] args) {
    
    	cal(3,5);		//Calling the cal function/method by directly creating the object
    	
    	Solution su = new Solution();		//Creating a new object named su of class Solution
    	su.cal(100,34);						//Calling the cal method by using object su
    	
      Another objectname = new Another();		//Creating a new object called objectname of class Another
      objectname.anoth();						//Calling the method anoth by using the object
    	}
    
    
   
    static void cal(int a , int b) {
    	int sum = a+b;
    	System.out.println(sum);
    }
}
class Another {
	 void anoth() {
		System.out.println("Hello");
	}
}

    
    	
    

    
    


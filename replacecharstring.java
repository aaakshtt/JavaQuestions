package com.company;
import java.util.*;

public class Solution1
{
    public static void main(String args[]) {
        String str1 = "A";
        int len = str1.length();
        if(len >= 3)
            System.out.println( str1.substring(0, 3));
        else if(len == 1)
            System.out.println( (str1+"##"));
        else if(len ==2)
            System.out.println(str1+"#");
        else
            System.out.println("###");




    }
}

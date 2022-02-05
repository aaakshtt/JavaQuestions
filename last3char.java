package com.company;
import java.util.*;

public class Solution1
{
    public static void main(String args[]) {
        String str = "Python 3.0";
        Character last = str.charAt(str.length()-1);
        Character secondlast = str.charAt(str.length()-2);
        Character thirdlast = str.charAt(str.length()-3);
        System.out.println((last+""+secondlast+""+thirdlast));


    }

}

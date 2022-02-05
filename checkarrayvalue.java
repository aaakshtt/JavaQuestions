package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Solution1
{
    public static void main(String args[]) {
        int test[] = {10,20,30,40};
        int x = (int) Array.get(test, 0);
        int y = (int) Array.get(test, 1);;
        if (x==10 || y==10){
            System.out.println("True");
        }else
            System.out.println("false");
        System.out.println(test[1] == 10 || test[0] == 10);     //Another method
    }

}

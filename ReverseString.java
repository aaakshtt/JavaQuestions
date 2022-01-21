package com.company;

public class ReverseString {
    public static void main(String[] args){
        String name = "Akshat";

        for(int i = name.length() -1;i<name.length() && i>=0;i--){
            System.out.print(name.charAt(i));
        }
//        System.out.println(name.length());
//        System.out.println(name.charAt(2));
    }

}

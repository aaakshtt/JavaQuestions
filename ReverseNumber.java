package com.company;

public class ReverseNumber {

    public static void main(String args[])
    {
        int rem ;
        int rev = 0;
        int num = 54321;
        while(num!= 0){         //Will check if the number is equal to zero
            rem = num % 10;     //Remainder will be calculated
            rev  = rev * 10 + rem;  //Reverse will
            num = num/10;
        }
        System.out.println(rev);
        System.out.println(54321%10+"   " +54321/10);

    }
}
//1.54321             2.54332
//rem =1                rem =2
//rev = 0*0 +1         rev = 1*10 +2
//  =1                    =12
//num = 5432              num  = 5432
package com.company;

public class Prime150 {
    public static void main(String[] args){

//        for(int i =2;i>1 && i<150;i++){
////            System.out.println(i);
            int i =1;
            int temp = 0;
            for(i=1;i<100;i++) {                   //Intialize i =1 , Increment i
                for(int j =2 ;j<=i-1;j++) {         //Intialize j =2 , Increment j
                    if (i % j == 0) {                   //If i is divisible by j temp is incremented
                        temp = temp + 1;
                    }
                }
                    if(temp == 0){
                        System.out.println(i);
                    }
                    else{
                        temp = 0;                   //Resetting the temp value = 0
                    }
                }
    }
}

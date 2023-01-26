public class Solution {
	
    public static void main(String[] args) {
    	prime(100);	
    }
    static void prime(int a) {
    	int n =0;
    	int sum = 0;
    	int temp = 0;
    	for(int i =2; i<101;i++) {
    		for(int j = 2;j<i;j++) {
    			if(i%j ==0){
    				temp = temp+1;
    				break;
    			}
    		}
    			if(temp ==0) {
    				System.out.println(i);
    				sum = sum +i;
    				n++;
    			}
    			else {
    				temp = 0;
    			}
	
    	}
    	System.out.println(sum);
    	
    }
     
     
}
   

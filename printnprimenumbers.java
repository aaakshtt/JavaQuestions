public class Solution {
	
    public static void main(String[] args) {
    	prime(100);	
    }
    static void prime(int a) {
    	int n =0;
    	
    	int temp = 0;
    	for(int i =1; n<=a;i++) {
    		for(int j = 2;j<i;j++) {
    			if(i%j ==0){
    				temp = temp+1;
    				break;
    			}
    		}
    			if(temp ==0) {
    				System.out.println(i);
    				n++;
    			}
    			else {
    				temp = 0;
    			}
	
    	}
    	
    }
     
     
}
 

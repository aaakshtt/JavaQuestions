public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int start =5;
    	int end = 20;
    	int p = 3;
    	int j=0;
    	for(int i=start;i<end;i++) {
    	
    		if(i%p ==0) {
    			j++;
    		}
    	}
    	System.out.println(j);
    }
}
  

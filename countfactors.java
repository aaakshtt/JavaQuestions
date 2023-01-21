public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num =sc.nextInt();
    	int j=0;
    	for(int i=1;i<=num;i++) {
    		if(num%i ==0) {
    			j++;
    		}
    	}
    	System.out.println(j);
    }
}
    
    	

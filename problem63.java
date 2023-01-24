public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a  =sc.nextInt();
    	int b = sc.nextInt();
    	if(a>b ) {
    		System.out.println(a);
    	}
    	else if(b>a) {
    		System.out.println(b);
    	}
    	else if(a==b) {
    		System.out.println("0");
    		
    	}
    	
    	if(a/6 == b/6) {
    		if(a>b ) {
        		System.out.println(b);
        	}
        	else if(b>a) {
        		System.out.println(a);
        	}
    	}
    	
    }
    
}
    
    	
    

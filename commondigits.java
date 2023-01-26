public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter first number");
    	int a = sc.nextInt();
    	System.out.println("Enter second number");
    	int b = sc.nextInt();
    	System.out.println(common_digits(a,b));
    	
    	
    }
     static boolean common_digits(int p , int q){
    	if(p<25 || q > 75)
    		return false;
    	int x = p%10;
        int y = q%10;
        p = p/10;
        q = q /10;
        return (p == q || p == y || x == q || x == y);
    	
    	
    }
     
}

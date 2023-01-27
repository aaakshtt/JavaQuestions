public class Solution {
    public static void main(String[] args) {
    	 pattern(6,6);
    }
    public static void pattern(int rows, int columns) {
    	for(int i = rows;i<=rows & i>0;i--) {
    		//Outer loop
    		for(int j =1;j<i & j>0;j++ ) {
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }	
 }
 /*
 12345
1234
123
12
1
*/

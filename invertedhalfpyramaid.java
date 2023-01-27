public class Solution {
    public static void main(String[] args) {
    	 pattern(4,4);
    }
    	public static void pattern(int row, int col) {
    		for(int i =1;i<=row;i++) {
    			//Outer loop
    			for(int j= col;j>0;j--) {
    				//inner loop
    				if(j>i) {
    					System.out.print(" ");	
    				}
    				else {
    					System.out.print("*");
    				}
    			}
    			System.out.println();
    		}
    	}
    	
    }
    
/*
   *
  **
 ***
****
*/

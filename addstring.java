public class Solution {
	
    public static void main(String[] args) {
    String str = "Python";
    String str2 = "Tutorial";
    String longstr , shortstr;
    if(str2.length()>str.length()) {
    	longstr = str2;
    	shortstr = str;
    }
    else {
    	longstr = str;
    	shortstr = str2;
    }
//    System.out.println("Long String is" + longstr);
//    System.out.println("Short String is" + shortstr);
    System.out.println(shortstr+longstr+shortstr);
    } 
  
}
   

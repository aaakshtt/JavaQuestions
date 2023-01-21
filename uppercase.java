public class Solution {
    public static void main(String[] args) {
    	String reqstr = "";
    	String str = "hello my name is akshat and i go to school";
    	String []arr = str.split(" ");
    	for(int i = 0;i<arr.length;i++) {
    		char ch = arr[i].charAt(0);
//    		System.out.println(ch);
    		String c1 = String.valueOf(ch).toUpperCase();
    		String sub = arr[i].substring(1);
    		reqstr = reqstr + c1 + sub +" ";
    	}
    	System.out.println(reqstr.trim());	
    }
}

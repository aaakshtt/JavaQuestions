// Write a Java program to find the penultimate (next to last) word of a sentence
public class Solution {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string");
    	String input= sc.nextLine();
    	String []str = input.split(" ");
//    	for(int i = 0;i<str.length;i++) {
//    		System.out.println(str[i]);
//    	}
    	System.out.println(str[str.length -2]);
    	
    }
}
    

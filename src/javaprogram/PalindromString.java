package javaprogram;

public class PalindromString {

	public static void main(String[] args) {
		String str= "MADAM";
		String org= str;
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			
			reverse=reverse+str.charAt(i);
			
		}
		
		System.out.println("Reverse"+ reverse);
		System.out.println(str.equals(reverse)? "I am":"I am not ");
		System.out.println(reverse.equalsIgnoreCase(str)? "I am palindrom string": "I am not");
	}
	
	
}

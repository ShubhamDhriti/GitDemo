package javaprogram;

import java.util.Scanner;

public class ReverseStringSimple {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String inputstr= sc.nextLine();
		System.out.println("Entered String: "+ inputstr);
//		int length= inputstr.length();
//		String reverseString="";
//		for(int i= inputstr.length()-1; i>=0;i-- ) {
//			
//			reverseString= reverseString+ inputstr.charAt(i);
//		}
//		
//		System.out.println(reverseString);
		
		
		
		// Using by converting string into character array
//		char str[]= inputstr.toCharArray();
//		int len=str.length;
//		String rev="";
//		
//		for(int i= len-1;i>=0;i--) {
//			
//			rev=rev+str[i];
//		}
//		
//		System.out.println("Reverse String are "+rev);
		
		// Using StringBuffer class
		
//		char str[]= inputstr.toCharArray();
//		StringBuffer stringBuffer= new StringBuffer(String.valueOf(str) );
//		StringBuffer reversedstring =stringBuffer.reverse();
//		
//		System.out.println("Reversed String with String Buffer class "+reversedstring);
	
	// Using String Builder class
		
//		char str[]= inputstr.toCharArray();
//		StringBuilder sb=new StringBuilder();
//		sb.append(str);
//		sb= sb.reverse();
//			
//		System.out.println("Reversed String "+ sb);
		
		
	
	}
}

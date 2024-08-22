package javaprogram;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter String to reverse word by word: ");
		String inputString= sc.nextLine();
		System.out.println("Entered Strings are "+inputString);
		
		String[] splitedString= inputString.split(" ");
		System.out.println("Splited char"+splitedString);
		String reverseString="";
		
		for(String str:splitedString) {
			
			String reverseword="";
			System.out.println("Word: "+str);
			for(int i= str.length()-1; i>=0; i--) {
//				reverseString=reverseString+ str.charAt(i)+"";
//				System.out.println("HElloo "+reverseString);	
				reverseword=reverseword+str.charAt(i);
				
			}
			
			System.out.println("Word>> "+reverseword);
			reverseString=reverseString+reverseword+" ";
			
		}
	
		System.out.println("Final reverse String  Output: "+reverseString);
	}
}

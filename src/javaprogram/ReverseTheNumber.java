package javaprogram;

import java.util.Scanner;

public class ReverseTheNumber {
 
	public static void main(String args[]) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=  sc.nextInt();

//		int reversenumber=0;
		

//		while(number !=0) {
//			
//			reversenumber= (reversenumber*10+ number%10);
//			number=number/10;
//		}
		
		
		
		// by StringBuffer
//		StringBuffer sd=new StringBuffer(String.valueOf(number));
//		StringBuffer reversenumber =sd.reverse();
		
		
		// by String builder
		
		StringBuilder sb= new StringBuilder();
		sb.append(number);
		StringBuilder reverse= sb.reverse();
		
		System.out.println("Reverse "+reverse);
	}
}

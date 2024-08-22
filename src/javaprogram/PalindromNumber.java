package javaprogram;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numer to check Palindrom ");
	   int number= sc.nextInt();
	   int originalnumber=number;
	   int rev=0;
	   
	   while(number!=0) {
		   
		   rev= rev*10+number%10;
		   number= number/10;
	   }
	   System.out.println("Reverse"+ rev);
//	  
//	   if(rev==originalnumber) {
//		   
//		   System.out.println("I am palindrom");
//	   }
//	   
//	   else {
//		   
//		   System.out.println("I am not palindrom");
//	   }
	   
	System.out.println(rev==originalnumber? "I am palindrom":"I am not palindrom");	
	}
	

}

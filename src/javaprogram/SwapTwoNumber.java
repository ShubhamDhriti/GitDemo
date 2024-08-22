package javaprogram;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a=10,b=20;
//		int t=a;
//		a=b;
//		b=t;
		
//		a=a+b; //10+20=30
//		b=a-b; //30-20=10
//		a=a-b; //30-10=20
		
//		a=a*b; //10*20= 200
//		b=a/b; //200/20=10
//		a=a/b; //200/10=20
		
//		a=a^b;//10^20 =30
//		b=a^b; //30^20=10
//		a=a^b; //30^10=20
		
		b=	a+b-(a=b);// a=20 then a+b= 10+20=30 >> 30-20=10
		
		
		
		System.out.println("After Swapping A "+a+ " B "+b);
	}
}

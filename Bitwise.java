// A program for the use of Bitwise Operators.
// date 07-02-2020

public class Bitwise{
	
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=~a;
		int d=~b;
		int e=a&b;
		int f=a|b;
		int g=a^b;
		int h=a>>1;
		int i=b<<1;
		int j=a>>>1
		
		
		System.out.println(" Complement of A : " + c);
		System.out.println(" Complement of B : " + d);
		System.out.println(" Bitwise AND : " + e);
		System.out.println(" Bitwise OR : " + f);
		System.out.println(" Bitwise Exclusive OR : " + g);
		System.out.println(" Bitwise Right Shift A : " + h);
		System.out.println(" Bitwise Left Shift B : " + i);
		System.out.println(" Bitwise Right Shift A : " + j);
		

	}
	

}
// A program for the use of Increment / Decrement Operators.
// date 06-02-2020

public class IncDec{
	
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c= ++a;
		int d= b++;
		
		
			System.out.println("A: " + c);
			System.out.println("B: " + d );
	}
}
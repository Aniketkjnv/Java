// A program of calculator.
// date 05-02-2020
public class calc{
	
	public static void main(String a[])
	{
		float b=Float.parseFloat(a[0])+ Float.parseFloat(a[1]);
		float c=Float.parseFloat(a[0])- Float.parseFloat(a[1]);
		float d=Float.parseFloat(a[0])* Float.parseFloat(a[1]);
		float e=Float.parseFloat(a[0])/Float.parseFloat(a[1]);
		int f=Integer.parseInt(a[0])%Integer.parseInt(a[1]);
		
		
		System.out.println("Sum of two numbers is " + b);
		System.out.println("Difference of two numbers is " + c);
		System.out.println("Product of two numbers is " + d);
		System.out.println("Division of two numbers is " + e);
		System.out.println("Remainder of two numbers is " + f);
	}

}
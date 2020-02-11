// A program to check the relation between two numbers.
// date 05-02-2020

public class relational{
	
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		if(a==b)
		{
			System.out.println( a + " is equals to " + b);
		}
		if(a!=b)
		{
			System.out.println( a + " is not equal to " + b + " and ");
		}
		if(a>b)
		{
			System.out.println( a + " is greater than " + b);
		}
		if(a<b){
		System.out.println( b+ " is greater than "+ a);
			}
		
	}
	

}
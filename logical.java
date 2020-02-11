// A program for the use of Logical Operators.
// date 06-02-2020

public class logical{
	
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		
		
		if(a>0&&b>0)
		{
			System.out.println("Both the numbers are greater than 0");
		}
		else if(a<0&&b<0){
		System.out.println("Both the numbers are less than 0");
			}
		else if(a<0||b<0){
		System.out.println("One of the numbers is less than 0");
			}
		else if(a>0||b>0){
		System.out.println("One of the numbers is greater than 0");
			}
	}
	

}
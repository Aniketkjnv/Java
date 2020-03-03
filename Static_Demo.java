// A program to demonstrate the use of static keyword
// Static Keyword is used to initialize the value of an object without referencing it to the class
//03-03-2020
 
class Static_class
{
	static int i=10,j;
	static
	{
		System.out.println("Static Block initialized.");
		j=i*10;
	}
	
	static void get_value()
	{
		System.out.println("The value of i : "+i);
		System.out.println("The value of j : "+j);
	}
}

class Static_Demo
{
	public static void main(String args[])
	{
		Static_class.get_value();
		System.out.println("Value of i : "+Static_class.i);
	}
}
// A program for the use of constructors for passing the values to the methods
//Default Constructor
//Date : 26-02-2020

class MyBox
{
	double ht;
	double width;
	double depth;
	
	MyBox()
	{
		ht=10;
		width=20;
		depth=30;
	}
	
	double calculate_volume()
	{
		return(ht*width*depth);
	}
}

class BoxDemo2
{
	public static void main(String args[])
	{
		MyBox b1 = new MyBox();
		MyBox b2 = new MyBox();
		
		System.out.println("Volume : " + b1.calculate_volume());
		System.out.println("Volume : " + b2.calculate_volume());
	}
}
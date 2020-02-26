// A program for the use of constructors for passing the values to the methods 
//Parametrized Constructor
//Date : 26-02-2020

class MyBox
{
	double ht;
	double width;
	double depth;
	
	MyBox()
	{
		System.out.println("Default Constructor");
		ht=10;
		width=20;
		depth=30;
	}
	
	MyBox(double h, double w, double d)
	{
		System.out.println("Parametrized Constructor");
		ht=h;
		width=w;
		depth=d;
	}
	
	double calculate_volume()
	{
		return(ht*width*depth);
	}
}

class BoxDemo3
{
	public static void main(String args[])
	{
		MyBox b1 = new MyBox();
		MyBox b2 = new MyBox(11,22,33);
		
		System.out.println("Volume : " + b1.calculate_volume());
		System.out.println("Volume : " + b2.calculate_volume());
	}
}
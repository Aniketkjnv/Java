//A program in Java to demonstrate the use of Methods with Parameters
//Date : 24-02-2020

class Mybox
{
	double height;
	double width;
	double depth;


void setvalues(double h, double w, double d)
{
	height=h;
	width=w;
	depth=d;
}

double calculate_volume()
{
	return(height*width*depth);
}

}
class BoxDemo1
{
	public static void main(String args[])
	{
		Mybox b1=new Mybox();
		Mybox b2=b1;
		b1.setvalues(10,20,30);
		System.out.println("volume of box is : " + b1.calculate_volume());
	
		b2.setvalues(11,22,33);
		
		System.out.println("Volume : " + b1.calculate_volume());
		System.out.println("Volume : " + b2.calculate_volume());
	}
	
	
}
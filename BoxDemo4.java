class MyBox
{
	double h;
	double w;
	double d;
	
		MyBox(double h, double w, double d)
		{
			this.h=h;
			this.w=w;
			this.d=d;
		}
	
		double calc_vol()
		{
			return(h*w*d);
		}
}

class BoxDemo4
{
	public static void main(String args[])
	{
		MyBox b1 = new MyBox(10,20,30);
		
		System.out.println(b1.calc_vol());
 	}
}
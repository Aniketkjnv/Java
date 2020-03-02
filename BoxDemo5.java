class MyBox
{
	double h,w,d;
	
	MyBox(double h, double w, double d)
	{
		this();
		this.h=h;
		this.w=w;
		this.d=d;
	}
	
	MyBox()
	{
		System.out.println("Constructor with no argument.");
	}
	
	double calc_vol()
	{
		double h=34.5;
		double vol;
		vol=this.h*this.w*this.d;
		return(vol);
	}
}

class BoxDemo5
	{
		public static void main(String args[])
		{
			MyBox b1=new MyBox(10,20,30);
			System.out.println(b1.calc_vol());
		}
	}
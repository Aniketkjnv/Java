class visibility
{
	private int i;
	protected int j;
	public int k;
	int l;

	
	void set_value(int a)
	{
		i=a;
	}
	int get_value()
	{
		return(i);
	}
}

class visibility_demo
{
	public static void main(String args[])
	{
		visibility v = new visibility();
		v.set_value(10);
		System.out.println("Value of i= "+ v.get_value());
		
		v.j=20;
		v.k=30;
		v.l=40;
		System.out.println("Value of j= "+ v.j);
		System.out.println("Value of k= "+ v.k);
		System.out.println("Value of l= "+ v.l);
	}
}
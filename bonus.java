public class bonus
{
	public static void main(String A[])
	{
		float bs=Float.parseFloat(A[0]);
		
		if(bs<10000)
		{
			System.out.println("Bonus Amount = 40% of the Basic salary : Rs" + (bs*0.4));
		}
		if(bs>10000&&bs<16000)
		{
			System.out.println("Bonus Amount = 35% of the Basic Salary : Rs" + (bs*0.35));
		}
		if(bs>16000)
		{
			System.out.println("Bonus Amount = 30% of the Basic Salary : Rs" + (bs*0.30));
		}
	}
}
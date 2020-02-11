public class marks
{
	public static void main(String A[])
	{
		int a=Integer.parseInt(A[0]);
		int b=Integer.parseInt(A[1]);
		int c=Integer.parseInt(A[2]);
		
		int s=a+b+c;
		int p=s/3;
		
		System.out.println("The marks entered by you are : \nCG:" +a );
		System.out.println("Java:" +b);
		System.out.println("CBNT:" +c);
		System.out.println("Percentage:" + p);
		
		if(p>45)
			{
				System.out.println("\n Congrats!\n You have Passed the exam.");
				
				if(p>80)
					{
						System.out.println(" Your Grade is A");
					}
				if(p>60)
					{
						System.out.println(" Your Grade is B");
					}
				else
					{
						System.out.println(" Your Grade is C");
					}
			}
		else
			{
				System.out.println("\n Sorry!\n You are fail.");
			}
	}
	


}
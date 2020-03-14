// A Program to demonstrate the use of inheritance
//Date- 14-03-2020

class A
{
	int a;
	void AA()
	{
		System.out.println("hello");
	}
}

class B extends A
{
	int b;
	void BB()
	{
		System.out.println("world");
	}
}

public class Inherit_demo
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.a=100;
		obj.b=20;
		obj.BB();
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
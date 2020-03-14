// A Program to demonstrate the use of multilevel inheritance
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

class C extends B
{
	int c;
}

public class Inherit_mul
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.a=100;
		obj.b=20;
		obj.c=30;
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
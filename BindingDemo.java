package com.jaggu.pack;

public class BindingDemo 
{
	public static void main(String[] args)
	{
		P p=new P();
		p.test(new Y());
		p.test(new Z());
	}
}
class X
{
	int i=1;
	void m1()
	{
		System.out.println("impl of X");
	}
}
class Y extends X
{
	int i=2;
	void m1()
	{
		System.out.println("impl of Y");
	}
}
class Z extends Y
{
	int i=3;
	void m1()
	{
		System.out.println("impl of Z");
	}
}
class P
{
	void test(X obj)
	{
		System.out.println("test() Starts");
		obj.m1();
		System.out.println(obj.i);
		System.out.println("test() Ends");
	}
}
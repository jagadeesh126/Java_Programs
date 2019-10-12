package com.jaggu.pack;

public class UpcastingDemo 
{
	public static void main(String[] args)
	{
		AB a1=new AB();
		System.out.println(a1.i);
		a1.m1();
		a1.m2();
		a1=new BC();
		System.out.println(a1.i);
		a1.m1();
		a1.m2();
		a1=new CD();
		System.out.println(a1.i);
		a1.m1();
		a1.m2();
	}
}

class AB
{
	int i=10;
	static void m1()
	{
		System.out.println("m1() impl of A");
	}
	void m2() 
	{
		System.out.println("m2() impl of A");
	}
}
class BC extends AB
{
	int i=20;
	static void m1()
	{
		System.out.println("m1() impl of B");
	}
	void m2()
	{
		System.out.println("m2() impl of B");
	}
}
class CD extends BC
{
	int i=30;
	static void m1()
	{
		System.out.println("m1() impl of C");
	}
	void m2()
	{
		System.out.println("m2() impl of C");
	}
}
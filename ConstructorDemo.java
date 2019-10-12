package com.jaggu.pack;

public class ConstructorDemo 
{
	public static void main(String[] args)
	{
		new D();
	}
}

class A
{
	A()
	{
		System.out.println("Constructor of A");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Constructor of B");
	}
}

class C extends B
{
	C()
	{
		System.out.println("Constructor of C");
	}
}

class D extends C
{
	D()
	{
		System.out.println("Cinstructor of D");
	}
}

package com.jaggu.pack;

public class NonStaticDemo
{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		new TestDemo1();
		new TestDemo1();
		new TestDemo1();
		System.out.println("Execution Ends");
	}
}

class TestDemo1
{
	static 
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("Non-Static Block");
	}
	TestDemo1()
	{
		System.out.println("Constructor");
	}
}
package com.jaggu.pack;

public class StaticDemo
{
	public static void main(String[] args) {
		System.out.println(TestDemo.i);
	}
}

class TestDemo
{
	static int i;
	static
	{
		i=10;
		System.out.println("Static Block");
	}
}
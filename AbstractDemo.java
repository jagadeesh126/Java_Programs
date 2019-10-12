package com.jaggu.pack;

public class AbstractDemo
{
	public static void main(String[] args)
	{
		Driver d=new Driver();
		d.Drive(new Audi());
		d.Drive(new Benz());
	}
}
abstract class Car
{
	abstract void Start();
	abstract void Accelerate();
	abstract void Break();
}
class Audi extends Car
{
	void Start()
	{
		System.out.println("Start() impl of Audi");
	}
	void Accelerate()
	{
		System.out.println("Accelerate() impl of Audi");
	}
	void Break()
	{
		System.out.println("Break() impl of Audi");
	}
}
class Benz extends Car
{
	void Start()
	{
		System.out.println("Start() impl of Benz");
	}
	void Accelerate()
	{
		System.out.println("Accelerate() impl of Benz");
	}
	void Break()
	{
		System.out.println("Break() impl of Benz");
	}
}

class Driver
{
	void Drive(Car c)
	{
		c.Start();
		c.Accelerate();
		c.Break();
	}
}
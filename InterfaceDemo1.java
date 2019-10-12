package com.jaggu.pack;

public class InterfaceDemo1
{
	public static void main(String[] args)
	{
		Camera c=new Iphone();
		c.on();
		c.takephoto();
		Phone1 p=new Iphone();
		p.on();
		p.call();
	}
}

interface Phone1
{
	void on();
	void call();
}
interface Camera
{
	void on();
	void takephoto();
}
class Iphone implements Phone1,Camera
{
	public void on()
	{
		System.out.println("Iphone is on");
	}
	public void call()
	{
		System.out.println("Calling through Iphone");
	}
	public void takephoto()
	{
		System.out.println("Photo captured through Iphone");
	}
}

package com.jaggu.pack;

public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Switch b=new Bulb();
		b.on();
		b.off();
		Switch f=new Fan();
		f.on();
		f.off();
	}
}
interface Switch
{
	void on();
	void off();
}
class Bulb implements Switch
{
	public void on()
	{
		System.out.println("Bulb is on");
	}
	public void off()
	{
		System.out.println("Bulb is off");
	}
}
class Fan implements Switch
{
	public void on()
	{
		System.out.println("Fan is on");
	}
	public void off()
	{
		System.out.println("Fan if off");
	}
}

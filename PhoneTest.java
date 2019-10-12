package com.jaggu.pack;

public class PhoneTest
{
	public static void main(String[] args)
	{
		Phone p=new Phone();
		p.dial();
	}
}

class Phone
{
	void dial()
	{
		System.out.println("2-G Network Implementation");
	}
}
class CameraPhone
{
	void dial()
	{
		System.out.println("3-G Network Implementation");
	}
}
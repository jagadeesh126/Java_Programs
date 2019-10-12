package com.jaggu.pack;

public class PolymorphismDemo
{
	public static void main(String[] args) 
	{
		Rider r=new Rider();
		Bike b=new Bike();
		r.ride(b);
	}
}
class Bike
{
	void Start()
	{
		System.out.println("Start() impl of Bike");
	}
}
class Pulsar extends Bike
{
	void Start()
	{
		System.out.println("Start() impl of Pulsar");
	}
}

class Rider
{
	void ride(Bike b)
	{
		System.out.println("ride(Bike) Strats");
		b.Start();
	}
	void rider(Pulsar p)
	{
		System.out.println("ride(Pulsar) Starts");
		p.Start();
	}
}

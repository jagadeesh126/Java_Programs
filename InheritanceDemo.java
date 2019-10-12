package com.jaggu.pack;

public class InheritanceDemo 
{
	public static void main(String[] args) 
	{
		MountainBike mb=new MountainBike(3,100,25);
		System.out.println(mb.toString());
	}
}

class Bicycle
{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	public void applyBreak(int Decrement)
	{
		speed-=Decrement;
	}
	public void speedUp(int Increment)
	{
		speed+=Increment;
	}
	public String toString()
	{
		return ("No of gears : "+gear+"\n"+"Speed of Bicycle : "+speed);
	}
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	public MountainBike(int gear,int speed,int seatHeight)
	{
		super(gear,speed);
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	public String toString() 
	{
		return(super.toString()+"\n"+"Seat height of Mountain Bike : "+seatHeight);
	}
}
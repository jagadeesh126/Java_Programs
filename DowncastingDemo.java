package com.jaggu.pack;

public class DowncastingDemo 
{
	public static void main(String[] args)
	{
		Shop sp=new Shop();
		Vegetables veg=Shop.sell("carrot");
	}
}
class Vegetables
{
	
}
class Carrot extends Vegetables
{
	void PrepareHalwa()
	{
		System.out.println("Halwa prepared");
	}
}
class Capsicum extends Vegetables
{
	void PrepareBajji()
	{
		System.out.println("Bajji Prepared");
	}
}
class Shop
{
	static Vegetables sell(String v)
	{
		if(v.equals("carrot"))
			return new Carrot();
		if(v.equals("Capsicum"))
			return new Capsicum();
		System.out.println(v+" not available");
		return null;
	}
}
package com.jaggu.pack;
import java.util.Scanner;

public class Factory
{
	public static Payable getObject()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter your option");
		String p=sn.nextLine();
		if(p.equalsIgnoreCase("debitcard"))
			return new Debitcard();
		if(p.equalsIgnoreCase("creditcard"))
			return new Creditcard();
		System.err.println("Invalid Input");
		return null;
	}
}
interface Payable
{
	void Pay();
}
class Debitcard implements Payable
{
	public void Pay() {
		System.out.println("Payment through debitcard");
	}
}
class Creditcard implements Payable
{
	public void Pay()
	{
		System.out.println("Payment through Creditcard");
	}
}
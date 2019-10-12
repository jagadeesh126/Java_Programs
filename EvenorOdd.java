package com.jaggu.pack;
import java.util.Scanner;

public class EvenorOdd 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sn.nextInt();
		sn.close();
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}

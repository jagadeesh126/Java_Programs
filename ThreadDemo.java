package com.jaggu.pack;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("Thread Starts");
		
	}
}

class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=26;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(400);
			}catch(Exception e) {}
		}
	}
}
class T2 extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch);
			try {
				Thread.sleep(400);
			}catch(Exception e) {}
		}
	}
}
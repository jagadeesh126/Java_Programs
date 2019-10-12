package com.jaggu.pack;

class parent 
{
	 public void work()
	 {
	  System.out.println("Parent is under retirement from work.");
	 }
}
	class child extends parent 
{
	 public void work() 
	 {
	  System.out.println("Child has a job");
	  System.out.println(" He is doing it well");
	 }
}
public class MethodOverriding
{
	 public static void main(String[] args) 
	 {
	  parent c1 = new parent();
	  c1.work();
	 }
}

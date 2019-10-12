package com.jaggu.pack;

public class EncapsulationDemo
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee();
		emp.setName("jaggu");
		String n=emp.getName();
		System.out.println("emp name = "+n);
	}
}
class Employee
{
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String newName)
	{
		name=newName;
	}
}
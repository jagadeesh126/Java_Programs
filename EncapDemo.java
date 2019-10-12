package com.jaggu.pack;

public class EncapDemo 
{
	public static void main(String[] args)
	{
		EmployeeData emp=new EmployeeData();
		emp.setName("Jagadeesh");
		emp.setId(10);
		emp.setPhoneNo(9493382261l);
		
		System.out.println("Employee Name : "+emp.getName());
		System.out.println("Employee Id : "+emp.getId());
		System.out.println("Employee Phone No : "+emp.getPhoneNo());
	}
}
class EmployeeData
{
	private String empName;
	private int empId;
	private long empPhoneNo;
	
	public void setName(String newName)
	{
		empName=newName;
	}
	public void setId(int newId)
	{
		empId=newId;
	}
	public void setPhoneNo(long newPhoneNo)
	{
		empPhoneNo=newPhoneNo;
	}
	public String getName()
	{
		return empName;
	}
	public int getId()
	{
		return empId;
	}
	public long getPhoneNo()
	{
		return empPhoneNo;
	}
}
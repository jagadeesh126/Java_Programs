package com.jaggu.pack;

public class StudentDemo 
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher("jaggu","Maths");
		System.out.println(t.name);
		System.out.println(t.subject);
	}
}

class Student
{
	String name;
	Student(String n)
	{
		name=n;
	}
}
class Teacher extends Student
{
	String subject;
	Teacher(String n,String s)
	{
		super(n);
		subject=s;
	}
}

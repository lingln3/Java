package com.generic.demo.bean;

public class Student extends Person{

	public Student()
	{
	}
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return "Student:"+getName()+"age:"+getAge();
	}
}

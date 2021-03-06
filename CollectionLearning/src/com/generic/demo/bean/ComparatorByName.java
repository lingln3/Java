package com.generic.demo.bean;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person>{
	
	@Override
	public int compare(Person p1,Person p2)
	{
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0 ? (p1.getAge()-p2.getAge()):temp;
	}

}

package com.collection.treeset;

import java.util.Comparator;

import com.basic.learning.bean.Person;

public class ComparatorByLength implements Comparator{

	@Override
	public int compare(Object obj1,Object obj2)
	{
		Person p1 = (Person)obj1;
		Person p2 = (Person)obj2;
		int temp = p1.getName().length() - p2.getName().length();
		return temp==0 ? p1.getName().compareTo(p2.getName()):temp;
	}
}

package com.collection.treeset;

import java.util.Comparator;

import com.collection.map.Student;

public class CompareByLength implements Comparator<Object>{
	@Override
	public int compare(Object obj1,Object obj2)
	{
		if(!(obj1 instanceof Student)
				|| !(obj2 instanceof Student))
			throw new ClassCastException("¿‡–Õ≤ª∆•≈‰");
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		int temp = s1.getName().length() - s2.getName().length();
		return temp==0? s1.getName().compareTo(s2.getName()):temp;
	}
}

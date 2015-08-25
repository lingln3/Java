package com.generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.generic.demo.bean.Person;

public class GenericDemo7 {

	public static void main(String[] args) {
		TreeSet<Person> ts1 = new TreeSet<Person>();
		ts1.add(new Person("abc3",25));
		ts1.add(new Person("abc",20));
		ts1.add(new Person("abc2",25));
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc1");
		al1.add("abc2");
		al1.add("abc3");
		al1.add("abc4");
		ts1.containsAll(al1);
//		Iterator<Person> it = ts1.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
		printCollection(ts1);
		
	}
	public static void printCollection(Collection<?> c)
	{
		Iterator<?> it = c.iterator();
		while(it.hasNext())
			System.out.println(it.next());
 	}
}

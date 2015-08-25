package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.basic.learning.bean.Person;

public class ArrayListTest {

	public static void main(String[] args) {
		Person 
		p1 = new Person("lina1",20),
		p2 = new Person("lina2",21);
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(p1);
		al.add(new Person("lina2",19));
		al.add(new Person("lina3",18));
		al.add(new Person("lina4",17));
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Person s = (Person) it.next();
			System.out.println("name:" + s.getName() + ",age:"+s.getAge());
		}
		Integer num = 7;
		int x = num + 8;
		show(567);
	}
	public static void show(Object num)
	{
		
	}

}

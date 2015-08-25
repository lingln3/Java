package com.generic.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.generic.demo.bean.Person;
import com.generic.demo.bean.Student;
import com.generic.demo.bean.Worker;

public class XiaxianDemo {

	public static void main(String[] args) {
		TreeSet<Worker> ts = new TreeSet<Worker>();
		ts.add(new Worker("abc",20));
		ts.add(new Worker("abc2",25));
		TreeSet<Person> ts1 = new TreeSet<Person>();
		ts1.add(new Person("abc3",25));
		ts1.add(new Person("abc",20));
		ts1.add(new Person("abc2",25));
		TreeSet<Student> ts2 = new TreeSet<Student>(new CompareByLength());
		ts2.add(new Student("haha",20));
		ts2.add(new Student("haha2",25));
		TreeSet<Integer> ts3 = new TreeSet<Integer>();
		ts3.add(3);
		ts3.add(4);
		TreeSet<String> ts4 = new TreeSet<String>();
		ts4.add("aa");
		ts4.add("hh");
		TreeSet<String> ts5 = new TreeSet<String>();
		ts5.addAll(ts4);
		
		Iterator<Person> it = ts1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
class CompareByLength implements Comparator<Person>{
	@Override
	public int compare(Person p1,Person p2)
	{
		int temp = p1.getName().length() - p2.getName().length();
		return temp==0? p1.getAge()-p2.getAge() : temp;
	}
}
class CompareByLengthStu implements Comparator<Student>{
	@Override
	public int compare(Student p1,Student p2)
	{
		int temp = p1.getName().length() - p2.getName().length();
		return temp==0? p1.getAge()-p2.getAge() : temp;
	}
}
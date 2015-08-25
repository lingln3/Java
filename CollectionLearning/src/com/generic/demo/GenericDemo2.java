package com.generic.demo;

import java.util.Iterator;
import java.util.TreeSet;

import com.generic.demo.bean.ComparatorByName;
import com.generic.demo.bean.Person;

public class GenericDemo2 {

	public static void main(String[] args) {
//		demo1();
		TreeSet<Person> ts = new TreeSet<Person>(new ComparatorByName());
		ts.add(new Person("lisi",20));
		ts.add(new Person("zhangsan",21));
		ts.add(new Person("zhangsan",20));
		ts.add(new Person("wangwu",22));
		ts.add(new Person("zhaoliu",23));
		ts.add(new Person("wangwu",22));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

	public static void demo1() {
		//TreeSet�Ƕ���������Ҫ�������ԣ�Person�������бȽ��ԣ�����ᱨ��
		//Person cannot be cast to java.lang.Comparable
		//�����Personʵ��Comparable�ӿ�
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("lisi",20));
		ts.add(new Person("zhangsan",21));
		ts.add(new Person("zhangsan",20));
		ts.add(new Person("wangwu",22));
		ts.add(new Person("zhaoliu",23));
		ts.add(new Person("wangwu",22));
		
		Iterator<Person> it = ts.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
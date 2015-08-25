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
		//TreeSet是二叉树，需要排序，所以，Person类必须具有比较性，否则会报错
		//Person cannot be cast to java.lang.Comparable
		//解决：Person实现Comparable接口
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

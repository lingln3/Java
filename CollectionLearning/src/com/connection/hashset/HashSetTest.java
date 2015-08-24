package com.connection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import com.basic.learning.bean.Person;

/*
 * 往HashSet集合中存储Person对象，如果姓名和年龄相同，视为同一个元素
 *
 */
public class HashSetTest {
	private HashSet has = new HashSet();
	public void myAdd(Object obj)
	{
		if(has.size() == 0)
		{
			has.add(obj);
		}
		else
		{
			for(Object ob:has)
			{				
			}
		}
		
	}
	public static void main(String[] args) {
		HashSet hash = new HashSet();
		
		/*
		 * HashSet集合，数据结构是哈希表，所以存储元素的时候，
		 * 使用的是元素的hashCode方法来确定位置，如果位置相同，再通过
		 * 元素的equals方法来确定是否相同。
		 * 
		 */
		hash.add(new Person("lina1",21));
		hash.add(new Person("lina2",20));
		hash.add(new Person("lina3",19));
		hash.add(new Person("lina4",18));
		hash.add(new Person("lina5",17));
		hash.add(new Person("lina5",17));
		hash.add(new Person("lina2",20));
		Iterator it = hash.iterator();
		while(it.hasNext())
		{
			Person p = (Person)it.next();
			System.out.println("name:"+p.getName()+",age:"+p.getAge());
		}
	}
}

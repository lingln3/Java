package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		/*
		 * 将学生对象和学生的归属地通过key-value存储到map集合中。
		 */
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(new Student("lisi",38),"北京");
		hm.put(new Student("zhaoliu",24),"上海");
		hm.put(new Student("xiaoqiang",31),"沈阳");
		hm.put(new Student("wangwu",28),"大连");
		hm.put(new Student("zhaoliu",24),"铁岭");
		hm.put(new Student("zhaoliu",24),"深圳");
		Set<Student> set = hm.keySet();
		Iterator<Student> it = set.iterator();
		while(it.hasNext())
		{
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"……"+value);
		}
//		System.out.println(hm);
	}

}

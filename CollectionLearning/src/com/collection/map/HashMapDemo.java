package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		/*
		 * ��ѧ�������ѧ���Ĺ�����ͨ��key-value�洢��map�����С�
		 */
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(new Student("lisi",38),"����");
		hm.put(new Student("zhaoliu",24),"�Ϻ�");
		hm.put(new Student("xiaoqiang",31),"����");
		hm.put(new Student("wangwu",28),"����");
		hm.put(new Student("zhaoliu",24),"����");
		hm.put(new Student("zhaoliu",24),"����");
		Set<Student> set = hm.keySet();
		Iterator<Student> it = set.iterator();
		while(it.hasNext())
		{
			Student key = it.next();
			String value = hm.get(key);
			System.out.println(key.getName()+":"+key.getAge()+"����"+value);
		}
//		System.out.println(hm);
	}

}
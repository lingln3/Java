package com.connection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import com.basic.learning.bean.Person;

/*
 * ��HashSet�����д洢Person�������������������ͬ����Ϊͬһ��Ԫ��
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
		 * HashSet���ϣ����ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ���Ԫ�ص�hashCode������ȷ��λ�ã����λ����ͬ����ͨ��
		 * Ԫ�ص�equals������ȷ���Ƿ���ͬ��
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

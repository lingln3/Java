package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.basic.learning.bean.Person;

/*
 * ȥ��ArrayList�е��ظ�Ԫ��
 */
public class ArrayListTest2 {

	public static void main(String[] args) {
//		singleDemo();
		ArrayList al = new ArrayList();
		al.add(new Person("lina1",21));
		al.add(new Person("lina2",20));
		al.add(new Person("lina3",19));
		al.add(new Person("lina4",18));
		al.add(new Person("lina5",17));
		al.add(new Person("lina5",17));
		al.add(new Person("lina2",20));
		//sopʱ����ӡal���Զ�����al.toString()
		//�˴��������Ѿ���д��Person�е�toString()
		//���Դ�ӡ�����Ľ����������toString()�ж���ķ���ֵ�й�
		System.out.println(al);
		al = singleElement2(al);
		System.out.println(al);
		System.out.println(al.remove(new Person("lina2",20)));
		System.out.println(al);
	}

	private static ArrayList singleElement2(ArrayList al) {
		ArrayList temp = new ArrayList();
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			/*ע�⣬��Ҫдtemp.contains(it.next()),
			 *��ᵼ��Ԫ�ر���©����Ϊit.next()�Ѿ�ָ����
			 *��һ��Ԫ�أ���ʹ��it.next()�ֻ�ָ����һ��Ԫ��
			 */
		
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		return temp;
	}

	public static void singleDemo() {
		ArrayList list = new ArrayList();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		list.add("abc1");
		list.add("abc");
		
		list = getSingleElements(list);
		System.out.println(list);
	}

	private static ArrayList getSingleElements(ArrayList list) {
		ArrayList temp = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			/*ע�⣬��Ҫдtemp.contains(it.next()),
			 *��ᵼ��Ԫ�ر���©����Ϊit.next()�Ѿ�ָ����
			 *��һ��Ԫ�أ���ʹ��it.next()�ֻ�ָ����һ��Ԫ��
			 */
		
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		return temp;
	}

}

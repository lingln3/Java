package com.collection.treeset;

import java.util.Comparator;

import com.basic.learning.bean.Person;
/*
 * ������һ������Person�����ô��������ıȽ���
 */
public class ComparatorName implements Comparator<Object> {
	public int compare(Object obj1,Object obj2)
	{
//		Person p1 = (Person)obj1;
//		Person p2 = (Person)obj2;
		//������������������
		/*int temp = p1.getName().compareTo(p2.getName());
		return temp == 0? (p1.getAge()-p2.getAge()):temp;*/
		//�������
//		return 1;
		//�������
		return -1;
	}
}

package com.collection.treeset;

import java.util.Comparator;

import com.basic.learning.bean.Person;
/*
 * 创建了一个根据Person类的那么进行排序的比较器
 */
public class ComparatorName implements Comparator<Object> {
	public int compare(Object obj1,Object obj2)
	{
//		Person p1 = (Person)obj1;
//		Person p2 = (Person)obj2;
		//按照姓名、年龄排序
		/*int temp = p1.getName().compareTo(p2.getName());
		return temp == 0? (p1.getAge()-p2.getAge()):temp;*/
		//正序输出
//		return 1;
		//倒叙输出
		return -1;
	}
}

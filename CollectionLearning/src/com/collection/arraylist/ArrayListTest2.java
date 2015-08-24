package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import com.basic.learning.bean.Person;

/*
 * 去除ArrayList中的重复元素
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
		//sop时，打印al会自动调用al.toString()
		//此处，我们已经复写了Person中的toString()
		//所以打印出来的结果跟我们在toString()中定义的返回值有关
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
			/*注意，不要写temp.contains(it.next()),
			 *这会导致元素被遗漏，因为it.next()已经指向了
			 *下一个元素，再使用it.next()又会指向下一个元素
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
			/*注意，不要写temp.contains(it.next()),
			 *这会导致元素被遗漏，因为it.next()已经指向了
			 *下一个元素，再使用it.next()又会指向下一个元素
			 */
		
			if(!temp.contains(obj))
			{
				temp.add(obj);
			}
		}
		return temp;
	}

}

package com.basic.learning;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc4");
		link.addLast("abc2");
		link.add("abc3");
		link.addLast("abc5");
		System.out.println(link);
		while(!link.isEmpty())
		{
			System.out.println(link.removeFirst());
		}
		System.out.println(link);
/*		System.out.println(link);
		System.out.println(link.removeFirst());//也是获取第一个元素，但是会删除
		System.out.println(link);
		System.out.println(link.removeLast());
		System.out.println(link);*/
/*		System.out.println(link.getFirst());//获取第一个，但不删除
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		System.out.println(link.getLast());*/
//		Iterator it = link.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next());
//		}
	}

}

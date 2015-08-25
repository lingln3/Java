package com.toolclass.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReplaceAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("abc2");
		list.add("abc3");
		list.add("abc2");
		list.add("abc5");
		list.add("djls");
		list.add("djaldjaj");
		list.add("ÕıŒ‰");
		System.out.println(list);
//		myReplaceAll(list, "abc2", "haha");
//		Collections.replaceAll(list, "abc2", "haha");
//		Collections.fill(list, "mymy");
		Collections.shuffle(list);
		System.out.println(list);
	}
	public static <T> void myReplaceAll(List<T> list,T t1,T t2)
	{
		while(list.contains(t1))
		{
			int index = list.indexOf(t1);
			list.set(index,t2);
		}
		
	}

}

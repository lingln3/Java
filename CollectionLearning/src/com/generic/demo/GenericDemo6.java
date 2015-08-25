package com.generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericDemo6 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("abc1");
		al1.add("abc2");
		al1.add("abc3");
		al1.add("abc4");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(5);
		al2.add(4);
		al2.add(7);
		iteratorCollection(al1);
		iteratorCollection(al2);
		iteratorTongpeifu(al1);
		iteratorTongpeifu(al2);
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("haha", 20);
		Set<Map.Entry<String, Integer>> set = map.entrySet();
	}
	public static void iteratorTongpeifu(Collection<?> al)
	{
		Iterator<?> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static<T> void iteratorCollection(Collection<T> al)
	{
		Iterator<T> it = al.iterator();
		while(it.hasNext())
		{
			T str = it.next();
			System.out.println(str);
		}
	}
	public static<T,V> void iteratorMap(Map<T,V> map)
	{
		Set<T> set = map.keySet();
		Iterator<T> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(map.get(it.next()));
		}
	}
	public static void iteratorMap2(Map<?,?> map)
	{
//		Set<Map.Entry<?, ?>> set = map.entrySet();
		
	}

}

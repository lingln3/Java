package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

interface MyMap
{
	public static interface MyEntry//内部接口
	{
		void get();
	}
}
class MyDemo implements MyMap//内部类
{
	public void get()
	{
		
	}
}


	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		method_get3(map);
	}
	
	public static void method_get3(Map<Integer,String> map)
	{
		map.put(1, "hehe1");
		map.put(2, "hehe2");
		map.put(3, "hehe3");
		map.put(4, "hehe4");
		//只要姓名，不要学号
		Collection<String> values = map.values();
		Iterator<String> it = values.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
	}
	
	public static void method_get2(Map<Integer,String> map)
	{
		map.put(1, "hehe1");
		map.put(2, "hehe2");
		map.put(3, "hehe3");
		map.put(4, "hehe4");
		//取出map中的所有元素
		/*
		 * 通过Map专程set就可以迭代
		 * 找到了另一个方法，entrySet()
		 * 该方法将key和value的映射关系作为对象存储到了Set集合中，而这个映射关系
		 * 的类型就是Map.Entry类型（结婚证）。
		 */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String> me = it.next();
			Integer key = me.getKey();
			String value = me.getValue();
			System.out.println("key:" + key + "  value:" + value);
		}
	}
	
	public static void method_get(Map<Integer,String> map)
	{
		map.put(1, "hehe1");
		map.put(2, "hehe2");
		map.put(3, "hehe3");
		map.put(4, "hehe4");
		//取出map中的所有元素
		//原理：先通过keySet方法获取map中的所有key所在的Set集合，再通过Set的迭代器获取每一个键
		//再通过每一个键获取对应的value即可
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"……"+map.get(obj));
		}
	}
	public static void method_basic(Map<Integer,String> map)//学号，姓名
	{
		//添加元素
		map.put(1, "hehe1");
		map.put(2, "hehe2");
		map.put(3, "hehe3");
		map.put(4, "hehe4");
		System.out.println(map.put(1, "haha"));
		System.out.println(map);
		System.out.println(map.put(5, "hehe5"));
		System.out.println(map.remove(2));
		System.out.println(map);
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("hoho"));
		System.out.println(map.containsValue("hehe1"));
		System.out.println(map.containsValue("haha"));
		System.out.println(map.get(3));
		System.out.println(map.get(6));
	}
}

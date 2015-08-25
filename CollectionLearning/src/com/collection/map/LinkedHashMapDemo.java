package com.collection.map;

import java.io.File;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
//		File f = null;
		hm.put("张三", 20);
		hm.put("李四", 22);
		hm.put("王武", 19);
		
		Iterator<Map.Entry<String, Integer>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> me = it.next();
			String name = me.getKey();
			Integer age = me.getValue();
			System.out.println(name+":"+age);
		}
	}

}

class ComparatorByName implements Comparator<Map.Entry<String, Integer>>{
	@Override
	public int compare(Map.Entry<String,Integer> m1,Map.Entry<String,Integer> m2)
	{
		return -1;
	}

}
	
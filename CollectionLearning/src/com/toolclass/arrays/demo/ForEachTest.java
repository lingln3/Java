package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachTest {

	public static void main(String[] args) {
		/*List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
		for(String s:list)
		{
			if(s.equals("abc3"))
				break;
			System.out.println(s);
		}*/
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("zhangsan", 23);
		map.put("lisi", 20);
		map.put("wangwu", 21);
		map.put("zhaoliu", 22);
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for(Map.Entry<String, Integer> me:set)
			System.out.println(me);
	}

}

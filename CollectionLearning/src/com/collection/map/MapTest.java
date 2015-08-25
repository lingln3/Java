package com.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 练习
 * 输入一串字符，打印每一个字母出现的次数
 * 如：输入“fdgavcbsacdfa”
 * 输出：a(2)b(1)……
 * 对结果的分析发现，字母和数字之间存在着映射关系，而且这种关系很多
 * 很多就需要存储，能存储映射的容器有数组和map集合
 * 关系方式无序，所以使用Map集合
 * 又发现可以保证唯一性的方式具备着序列 a b c
 * 所以可以使用TreeMap集合
 */
public class MapTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Map<String,Integer> tm = new TreeMap<String,Integer>();
		put(tm,s);
		/*Iterator<Map.Entry<String, Integer>> it = tm.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> me = it.next();
			String key = me.getKey();
			Integer value = me.getValue();
			System.out.print(key+"("+value+")");
		}*/
		Iterator<String> it = tm.keySet().iterator();
		StringBuffer buffer = new StringBuffer();
		while(it.hasNext())
		{
			String key = it.next();
			Integer value = tm.get(key);
//			System.out.println(key+"("+value+")");
			buffer.append(key+"("+value+")");
		}
		System.out.println(buffer);
		
	}
	public static void put(Map<String,Integer> tm,String s)
	{
		char[] ch = s.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			
			int value = tm.containsKey(""+ch[i])? tm.get(""+ch[i])+1:1;
			tm.put(""+ch[i], value);
			/*if(!tm.containsKey(""+ch[i]))
				tm.put(""+ch[i], 1);
			else
			{
				int value = tm.get(""+ch[i])+1;
				tm.put(""+ch[i], value);
			}*/
		}
	}

}

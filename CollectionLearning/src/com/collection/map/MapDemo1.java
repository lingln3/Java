package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

interface MyMap
{
	public static interface MyEntry//�ڲ��ӿ�
	{
		void get();
	}
}
class MyDemo implements MyMap//�ڲ���
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
		//ֻҪ��������Ҫѧ��
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
		//ȡ��map�е�����Ԫ��
		/*
		 * ͨ��Mapר��set�Ϳ��Ե���
		 * �ҵ�����һ��������entrySet()
		 * �÷�����key��value��ӳ���ϵ��Ϊ����洢����Set�����У������ӳ���ϵ
		 * �����;���Map.Entry���ͣ����֤����
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
		//ȡ��map�е�����Ԫ��
		//ԭ������ͨ��keySet������ȡmap�е�����key���ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡÿһ����
		//��ͨ��ÿһ������ȡ��Ӧ��value����
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj+"����"+map.get(obj));
		}
	}
	public static void method_basic(Map<Integer,String> map)//ѧ�ţ�����
	{
		//����Ԫ��
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
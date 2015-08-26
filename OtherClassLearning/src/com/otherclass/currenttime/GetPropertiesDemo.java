package com.otherclass.currenttime;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetPropertiesDemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
//		demo1();
//		demo2();
		System.out.println("hello world" + LINE_SEPARATOR +"nihao");
		//��ϵͳ����һЩ������Ϣ����Щ��Ϣ��ȫ�ֵģ��������򶼿���ʹ��
		System.setProperty("myKey", "jdaljeio134jljladf");
	}
	public static void demo1()
	{
		/*
		 * ��ȡϵͳ��������Ϣ��������洢��Properties�����С�
		 * Properties��HashTable������
		 */
		Properties prop = System.getProperties();
		Set<Map.Entry<Object,Object>> set = prop.entrySet();
		Iterator<Map.Entry<Object, Object>> it = set.iterator();
		while(it.hasNext())
		{
			Map.Entry<Object, Object> next = it.next();
			Object key = next.getKey();
			Object value = next.getValue();
			System.out.println("key:"+key + "����"+"value:"+value);
		}
	}
	public static void demo2()
	{
		Properties prop = System.getProperties();
		Set<String> nameSet = prop.stringPropertyNames();
		for(String name:nameSet)
		{
			String value = prop.getProperty(name);
			System.out.println(name+":::"+value);
		}
	}
}
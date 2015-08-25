package com.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * ��ϰ
 * ����һ���ַ�����ӡÿһ����ĸ���ֵĴ���
 * �磺���롰fdgavcbsacdfa��
 * �����a(2)b(1)����
 * �Խ���ķ������֣���ĸ������֮�������ӳ���ϵ���������ֹ�ϵ�ܶ�
 * �ܶ����Ҫ�洢���ܴ洢ӳ��������������map����
 * ��ϵ��ʽ��������ʹ��Map����
 * �ַ��ֿ��Ա�֤Ψһ�Եķ�ʽ�߱������� a b c
 * ���Կ���ʹ��TreeMap����
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
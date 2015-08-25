package com.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map��������ӳ���ϵʱ���������ȿ���
 * �ڲ���е�Ӧ�ý�Ϊ���
 */
public class MapTest2 {

	public static void main(String[] args) {
		System.out.println(getWeekByMap("������"));
	}
	
	public static String getWeekByMap(String s)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("����һ", "Monday");
		map.put("���ڶ�", "Tuesday");
		map.put("������", "Wednesday");
		map.put("������", "Thursday");
		map.put("������", "Friday");
		map.put("������", "Saturday");
		map.put("������", "Sunday");
		
		return map.get(s);
	}
	
	public static String getWeek(int week)
	{
		if(week<1 || week >7)
			throw new RuntimeException("û�ж�Ӧ�����ڣ�����������");
		String[] weeks = {"����һ","���ڶ�","������","������","������","������","������"};
		return weeks[week];
	}
}

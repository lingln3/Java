package com.collection.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合在有映射关系时，可以优先考虑
 * 在查表法中的应用较为多见
 */
public class MapTest2 {

	public static void main(String[] args) {
		System.out.println(getWeekByMap("星期日"));
	}
	
	public static String getWeekByMap(String s)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("星期一", "Monday");
		map.put("星期二", "Tuesday");
		map.put("星期三", "Wednesday");
		map.put("星期四", "Thursday");
		map.put("星期五", "Friday");
		map.put("星期六", "Saturday");
		map.put("星期日", "Sunday");
		
		return map.get(s);
	}
	
	public static String getWeek(int week)
	{
		if(week<1 || week >7)
			throw new RuntimeException("没有对应的星期，请重新输入");
		String[] weeks = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		return weeks[week];
	}
}

package com.otherclass.calendar;

import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		getDay(2000);
	}
	
	public static void getDay(int year)
	{
		Calendar cl = Calendar.getInstance();
		cl.set(year, 2, 1);
		cl.add(Calendar.DAY_OF_MONTH, -1);
		getDate(cl);
	}

	public static void dateShow() {
		Calendar cl = Calendar.getInstance();
		cl.set(2015, 8, 20);		
		getDate(cl);//2015��9��20������һ��ע����Ϊ�·��Ǵ�0~11������8��9�·�
		cl.add(Calendar.MONTH, 5);
		getDate(cl);
	}
	
	public static void getDate(Calendar cl)
	{
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH)+1;
		int date = cl.get(Calendar.DAY_OF_MONTH);
		int week = cl.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"��"+month+"��"+date+"��"+getWeek(week));
	}
	public static String getWeek(int week)
	{
		String[] str = {"������","����һ","���ڶ�","������","������","������","������"};
		return str[week-1];
	}
}
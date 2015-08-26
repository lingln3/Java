package com.otherclass.calendar;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		int year = cl.get(Calendar.YEAR);
		int month = cl.get(Calendar.MONTH)+1;
		int date = cl.get(Calendar.DAY_OF_MONTH);
		int week = cl.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"年"+month+"月"+date+"日"+getWeek(week));
	}
	public static String getWeek(int week)
	{
		String[] str = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return str[week];
	}

}

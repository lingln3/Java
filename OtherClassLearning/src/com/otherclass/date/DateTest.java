package com.otherclass.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 练习：
 * “2013-3-17”到“2015-8-26”
 * 中间有多少天？ 
 */
public class DateTest {

	public static void main(String[] args) throws ParseException{
		String s1 = "2013-3-17";
		String s2 = "2015-8-26";
		minus(s1,s2);
	}
	public static void minus(String s1,String s2) throws ParseException
	{
		int day = 0;
		//定义日期格式对象
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = format.parse(s1);
		Date date2 = format.parse(s2);
		//转化为毫秒值
		long min1 = date1.getTime();
		long min2 = date2.getTime();
		long minus = Math.abs(min1-min2);
		day = (int)getDay(minus);
		System.out.println(day);
	}
	public static long getDay(long time)
	{
		return time/1000/24/60/60;
	}
}

package com.otherclass.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		
		String str = "2015年08月26日";
		DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
		Date date = format.parse(str);
		System.out.println(date);
		
	}

	public static void demo3() throws ParseException {
		String str = "2015-10-15";
		DateFormat format = DateFormat.getDateInstance();
		Date date = format.parse(str);
		System.out.println(date);
	}

	public static void demo2() {
		Date date = new Date();
		//如果风格是自定义的，使用SimpleDateFormat类
		DateFormat simple = new SimpleDateFormat("yyyy.MM.dd-kk:mm");
		String simple_date = simple.format(date);
		System.out.println(simple_date);
	}

	public static void demo1() {
		/*
		 * 对日期对象进行格式化
		 */
		Date date = new Date();
		//获取日期格式器，该格式器具有默认语言环境的默认格式化风格
		DateFormat myFormat = DateFormat.getInstance();
		DateFormat myDateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat myDateTimeFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		DateFormat myTimeFormat = DateFormat.getTimeInstance();
		
		String 
		str_date1 = myFormat.format(date),
		str_date2 = myDateFormat.format(date),
		str_date3 = myDateTimeFormat.format(date),
		str_date4 = myTimeFormat.format(date);
		System.out.println(str_date1);
		System.out.println(str_date2);
		System.out.println(str_date3);
		System.out.println(str_date4);
		
	}

}

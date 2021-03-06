package com.otherclass.math;

import java.util.Random;

public class MathDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		/*
		 * Math提供了操作数字
		 */
//		demo1();
		Random r = new Random();
		for(int i=0; i< 10; i++)
		{
//			double random = Math.ceil(Math.random()*10);//1~10
//			double random = Math.floor(Math.random()*10);//0~9
//			double random = r.nextDouble();
			int random = r.nextInt(8);
			System.out.println(random);			
		}
	}
	public static void demo1() {
		double ceil = Math.ceil(12.324);
		double floor = Math.floor(12.324);
		double round = Math.round(12.324);
		double round2 = Math.round(12.501);
		double pow = Math.pow(2, 10);
		System.out.println(ceil + LINE_SEPARATOR + floor);
		System.out.println(round + LINE_SEPARATOR + round2);
		System.out.println(pow);
	}

}

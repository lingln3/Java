package com.otherclass.date;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date date = new Date();//����ǰ���ں�ʱ���װ��Date����
		System.out.println(date);
		
		Date date2 = new Date(time);//��ָ������ֵ��װ��Date����
		System.out.println(date2);
	}
	/*���ڶ���ͺ���ֵ֮���ת��
	 * 
	 * ����ֵ->���ڶ���
	 * 	1. ͨ��Date����Ĺ��췽�� new Date(timeMillis);
	 *  2. ������ͨ��setTime����
	 * ��Ϊ������ͨ������ķ����Ը������еĸ����ֶΣ������գ����в�����
	 * 
	 * ���ڶ���->����ֵ
	 *  1. getTime����
	 * ��Ϊ������ͨ���������ֵ��������
	 */
}
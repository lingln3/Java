package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * ����ת������
 * ʹ�õ���Collection�ӿ��е�ToArray()������
 * ���ϱ����飬���ԶԼ����е�Ԫ�ز����ķ��������޶������������������ɾ
 */
public class ToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		/*
		 * toArray()������Ҫ����һ��ָ�����͵����顣
		 * �������<���ϵ�size����ô�÷����ᴴ��һ��ͬ���Ͳ��ͼ�����ͬsize������
		 * �������>���ϵ�size����ô�÷�����ʹ��ָ�������飬�洢�����е�Ԫ�أ�����λ��Ĭ��Ϊnull
		 * ���Խ��飬��ó��Ⱦ�ָ��Ϊ���ϵ�size
		 */
		String[] arr = list.toArray(new String[2]);
		System.out.println(Arrays.toString(arr));
	}
//	public static <T> T[] myToArray(Collection<T> c)
//	{
//		T[] temp;
//		int size = c.size();
//		if(c.size() < temp.length)
//			return Arrays.co
//		
//	}
}
package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Arrays.asList()将数组转为集合
 */
public class ArraysAsListDemo {

	public static void main(String[] args) {
		/*Integer[] arr = {3,2,34,56,3,7};
		List<Integer> list = myAsList(arr);
		System.out.println(list);
		System.out.println(myContains(arr,44));
		List<Integer> list2 = Arrays.asList(arr);*/
		/*
		 * 注意：数组的长度是固定的，所以对于集合的增删方法是不可以使用的。
		 * 否则，会发生java.lang.UnsupportedOperationException异常。
		 */
//		list2.add(33);//java.lang.UnsupportedOperationException
//		System.out.println(list2.contains(35));
		demo2();
	}
	
	public static void demo2()
	{
		/*
		 * 如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素
		 * 进行集合存储。
		 * 如果数组中的元素是基本数据类型，那么会将数组作为集合中的元素进行存储。
		 */
		int[] arr = {2,3,4,23,343,2,34};
		List<int[]> list = Arrays.asList(arr);
		System.out.println(list);
		Integer[] arr2 = {2,3,4,23,343,2,34};
		List<Integer> list2 = Arrays.asList(arr2);
		System.out.println(list2);
	}
	public static <T> List myAsList(T[] t)
	{
		List<T> list = new ArrayList<T>();
		for(T t1:t)
		{
			list.add(t1);
		}
		return list;
	}
	public static <T> boolean myContains(T[] arr,T key)
	{
		int length = arr.length;
		for(int i=0; ; i++)
		{
			if(i == length)
				return false;
			if(arr[i].equals(key))
				return true;
		}
	}
}

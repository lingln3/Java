package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Arrays.asList()������תΪ����
 */
public class ArraysAsListDemo {

	public static void main(String[] args) {
		/*Integer[] arr = {3,2,34,56,3,7};
		List<Integer> list = myAsList(arr);
		System.out.println(list);
		System.out.println(myContains(arr,44));
		List<Integer> list2 = Arrays.asList(arr);*/
		/*
		 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ�����ǲ�����ʹ�õġ�
		 * ���򣬻ᷢ��java.lang.UnsupportedOperationException�쳣��
		 */
//		list2.add(33);//java.lang.UnsupportedOperationException
//		System.out.println(list2.contains(35));
		demo2();
	}
	
	public static void demo2()
	{
		/*
		 * ��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ��
		 * ���м��ϴ洢��
		 * ��������е�Ԫ���ǻ����������ͣ���ô�Ὣ������Ϊ�����е�Ԫ�ؽ��д洢��
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
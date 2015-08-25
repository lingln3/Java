package com.toolclass.arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/*
 * 集合转成数组
 * 使用的是Collection接口中的ToArray()方法。
 * 集合变数组，可以对集合中的元素操作的方法进行限定：不允许对其进行增删
 */
public class ToArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		/*
		 * toArray()方法需要传入一个指定类型的数组。
		 * 如果长度<集合的size，那么该方法会创建一个同类型并和集合相同size的数组
		 * 如果长度>集合的size，那么该方法会使用指定的数组，存储集合中的元素，其他位置默认为null
		 * 所以建议，最好长度就指定为集合的size
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

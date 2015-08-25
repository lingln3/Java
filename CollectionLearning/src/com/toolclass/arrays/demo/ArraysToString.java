package com.toolclass.arrays.demo;

import java.util.Arrays;

public class ArraysToString {

	public static void main(String[] args) {
		int[] arr = {3,2,34,56,3,7};
		
		System.out.println(Arrays.toString(arr));
	}
	//toString的经典实现
	public static String myToString(int[] a)
	{
	     if (a == null)
	            return "null";
	        int iMax = a.length - 1;
	        if (iMax == -1)
	            return "[]";

	        StringBuilder b = new StringBuilder();
	        b.append('[');
	        for (int i = 0; ; i++) {//中间省略条件判断，提高了效率
	            b.append(a[i]);
	            if (i == iMax)
	                return b.append(']').toString();
	            b.append(", ");
	        }
	}
}

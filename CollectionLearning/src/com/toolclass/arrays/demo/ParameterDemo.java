package com.toolclass.arrays.demo;

import java.util.Scanner;

public class ParameterDemo {

	public static void main(String[] args) {
//		int sum 
		Scanner scan = new Scanner(System.in);	
		int sum = newAdd(3,4,2,3,46,6);
		System.out.println(sum);
	}
	
	public static int newAdd(int... arr)
	{
//		System.out.println(arr);
		int sum = 0;
		for(int i:arr)
			sum = sum+i;
		return sum;
	}
	
	public static int add(int[] arr)
	{
		int sum = 0;
		for(int i: arr)
			sum = sum + i;
		return sum;
	}
}

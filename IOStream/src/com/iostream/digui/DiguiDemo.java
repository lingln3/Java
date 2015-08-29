package com.iostream.digui;

public class DiguiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		toBinary2(6);
		int sum = sum(5);
		System.out.println(sum);
	}
	public static int sum(int num)
	{
		if(num == 1)
			return 1;		
		return num+sum(num-1);
	}
	public static void toBinary(int num)
	{
		while(num > 0)
		{
			System.out.println(num%2);
			num = num/2;
//			toBinary(num);
		}
	}
	public static void toBinary2(int num)
	{
		if(num>0)
		{
			System.out.println(num%2);
			toBinary2(num/2);
		}
	}
	
}

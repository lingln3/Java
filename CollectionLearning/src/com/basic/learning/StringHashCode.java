package com.basic.learning;

public class StringHashCode {
	
	public static int getHashCode(String s)
	{
		int value = 0;
		int length = s.length();
		if(length == 0)
		{
			return 0;
		}
		else
		{
			for(int i=0; i<length;i++)
			{
				
//				value = value + (int)(s.charAt(i)*Math.pow(31, length-i-1));
				value = value + s.charAt(i)*myPow(31,length-i-1);
			}
			return value;			
		}
	}
	public static int myPow(int a,int b)
	{
		int result = 1;
		for(int i=0; i<b;i++)
		{
			result = result*a;
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "abjfklcsae";
		System.out.println(s.hashCode());
		System.out.println(getHashCode(s));
	}

}

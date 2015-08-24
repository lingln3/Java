package com.basic.learning;

import java.util.Scanner;

public class Time {
	private static int hour = 24;
	private static int min = 60;
	public static void main(String[] args) {
		String s1,s2,s;
		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		s2 = scan.nextLine();
		if(s1.length() > s2.length())
		{
			s = s1;
			s1 = s2;
			s2 = s;
		}
		int size = s1.length();
		int max_s =0,max_length = 0;
		char[] c1 = s1.toCharArray();
		for(int i=0; i<size-1; i++)
		{
			for(int j=0; j<s2.length()-1; j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					int k = 1;
					for(;(i+k)<size&&(j+k)<s2.length();k++)
					{
						if(s1.charAt(i+k) != s2.charAt(j+k))
						{
							break;
						}
					}
					int max = k;
					int max_start = i;
					if(max > max_length)
					{
						max_length = k;
						max_s = i;						
					}
				}
			}
		}
		String sub = s1.substring(max_s,max_s+max_length);
		System.out.println(sub);
	}

}
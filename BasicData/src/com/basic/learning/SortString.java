package com.basic.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortString {

	public static void main(String[] args) {
		String s = "20 78 9 -7 88 36 29";
		String[] s2 = s.split(" ");
		Pattern pat = Pattern.compile("[0-9]{1,}");
		Matcher match = pat.matcher(s);
		while(match.find())
		{
			System.out.println(match.group());			
		}
		int[] array = new int[s2.length];
		for(int i=0; i<s2.length; i++)
		{
			array[i] = Integer.parseInt(s2[i]);
		}
		Arrays.sort(array);
		for(int i:array)
		{
			System.out.println(i);
		}
	}

}

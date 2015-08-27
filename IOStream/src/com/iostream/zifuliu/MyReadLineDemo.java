package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;

public class MyReadLineDemo {
	private static int start = 0;
	private static StringBuilder str = new StringBuilder();
	
	private static FileReader fr = null;
	private static boolean flag = false;
	public static void main(String[] args) throws IOException {
		String s1 = null;
		while((s1 = myReadLine())!= null)
			System.out.println(s1);
//		System.out.println(s1+start);
//		String s2 = myReadLine();
//		System.out.println(s2+start);
	}
	public static String myReadLine() throws IOException
	{
		fr = new FileReader("demo2.txt");
		StringBuilder str2 = new StringBuilder();
		int ch = 0; 
		if(!flag)
		{
			while((ch=fr.read())!= -1)
			{
				str.append((char)ch);
			}
			flag = true;
		}
		
//		System.out.println(str.length());
		int i = start;
		if(start >= str.length())
			return null;
		for(; i<str.length()&& (str.charAt(i) != '\n'|| str.charAt(i) != '\r');i++)
		{
			str2.append(str.charAt(i));
//			if(str.charAt(i) != '\n')
//			{
//				str2.append(str.charAt(i));
//			}
//			else
//			{
//				break;
//			}
		}
		start = i+1;
//		System.out.println(str);
//		System.out.println(str2);
		return str2.toString();
	}
}

package com.iostream.keyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class KeyRead {

	public static void main(String[] args) throws IOException {
		readKey2();
	}
	
	public static void readKey() throws IOException
	{
		InputStream in = System.in;
		//读键盘		
//		int ch = in.read();//阻塞式方法，没数据就会等待
		int ch = 0;
		while((ch = in.read())!= (int)'\r')
			System.out.println(ch);
//		in.close();
//		System.out.println(ch);
	}
	
	public static void readKey2() throws IOException
	{   
		/*
		 * 获取用户键盘录入的数据，
		 * 并将数据变成大写，显示在控制台上
		 * 如果用户输入的是over，结束键盘录入
		 * 
		 * 思路：
		 * 1。 因为键盘录入只读取一个字节，要判断是否是over，
		 * 需要先将读到的字节拼成字符串。
		 * 2。 那就需要一个容器：StringBuilder
		 * 3。 在用户回车之前将输入的数据变成字符串判断即可。
		 */
		//创建容器
		StringBuilder sb = new StringBuilder();
		//获取键盘读取流
		InputStream in = System.in;
		//定义变量记录数据读到的字节，并循环获取
		int ch = 0;
		while((ch = in.read())!= -1)
		{
			if(ch == '\r')
				continue;
			if(ch == '\n')
			{
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0,sb.length());
			}
			else{
				//	将读取到的字节存储到StringBuilder中
				sb.append((char)ch);
//				System.out.println(ch);
			}
		}
		
	}

}

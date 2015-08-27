package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;

public class ReadArrayDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		/*
		 * 使用read[char[]]读取文本文件数据
		 * 
		 * 先创建字符数组
		 */
		char[] buf = new char[1024];
		int len = 0;
		try
		{
			fr = new FileReader("demo.txt");
			while((len = fr.read(buf))!=-1)
				System.out.println(new String(buf,0,len));
//			ch = fr.read(buf);
//			System.out.println(ch+":"+new String(buf,0,ch));
//			int ch2 = fr.read(buf);
//			System.out.println(ch2+":"+new String(buf,0,ch2));
//			int ch3 = fr.read(buf);
//			System.out.println(ch3+":"+new String(buf,0,ch3));
//			int ch4 = fr.read(buf);
//			System.out.println(ch4+":"+new String(buf,0,ch4));
//			int ch5 = fr.read(buf);
//			System.out.println(ch5+":"+new String(buf,0,ch5));
		}catch(IOException e)
		{
			
		}finally{
			
		}
	}

}

package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * exercise
 * 将c盘的一个文本文件复制到d盘
 * 
 * 复制原理：连读带写
 * 读取c盘文件中的数据，将这些数据写入到d盘当中。
 */
public class IOTest {
	private static final int BUFFER_SIZE = 1024;
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] read = new char[BUFFER_SIZE];//缓冲区
		int len_r = 0;
		try{
			//读取一个已有的文本文件，使用字符读取流和文件相关联
			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Runtime.txt");
			//创建一个目标，用于存储数据
			fw = new FileWriter("E:\\Copy.txt");
		/*	while((len_r = fr.read(read))!=-1);
			fw.write(read,0,len_r);*/
			//读一个写一个
			int ch = 0;
			while((ch = fr.read())!=-1)
				fw.write(ch);
			fw.flush();
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}finally
		{
			if(fr!=null)
			{
				try{
					fr.close();
					}catch(IOException e)
					{
						throw new RuntimeException("某个文件不存在");
					}
			}
			if(fw!=null)
			{
			try{
					fw.close();
				}catch(IOException e)
				{
					throw new RuntimeException("某个文件不存在");
				}
			}
			
		}
	}

}

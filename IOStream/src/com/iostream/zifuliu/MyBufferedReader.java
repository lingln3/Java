package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 自定义的读取缓冲区，其实就是模拟一个BufferedReader
 * 
 * 缓冲区中无非就是封装了一个数组
 * 并提供了更多的方法对数组进行访问
 * 其实这些方法最终操作的都是数组的角标（指针）。
 * 
 * 缓冲的原理：
 * 其实就是从源中取出一批数据装进缓冲区中。
 * 再从缓冲区中不断的取出一个一个数据。
 * 
 * 在此次取完后，再从源中继续取一批数据进缓冲区。
 * 当源中的数据取光时，用-1作为结束标记
 */
public class MyBufferedReader extends Reader{
	Reader fr = null;
	//定义一个数组作为缓冲区
	private char[] buf = new char[1024];
	//定一个指针用于操作这个数组中的元素，当操作到最后一个元素后，指针应该归零。
	private int pos = 0;
	//定一个计数器，记录缓冲区中的数据个数，当该数据减到零，就从源中继续获取数据到缓冲区中。
	private int count = 0;
	
	public MyBufferedReader(Reader fr) {
		this.fr = fr;
	}
	
	public int myRead() throws IOException
	{
		//从源中获取一批数据到缓冲区中，需要先做判断，只有计数器count为0时，才需要从源中获取数据
		if(count == 0)
		{
			count = fr.read(buf);
			pos = 0;
		}
		if(count < 0)
			return -1;
		 char  ch = buf[pos];
		 pos++;
		 count--;
		 return ch;
		/*if( count == 0)
		{
			count = fr.read(buf);
			
			if(count < 0)
				return -1;			
			pos = 0;
			int ch = buf[pos];
			pos++;
			count--;
			return ch;
		}else if(count >0)
		{
			int ch = buf[pos];
			pos++;
			count--;
			return ch;
		}*/
		
	}
	
	public String myReadLine() throws IOException
	{
		StringBuilder str = new StringBuilder();
		int ch = 0;
		while( (ch = myRead())!= -1)
		{
			if(ch == '\r')
				continue;
			if(ch == '\n')
				return str.toString();
			str.append((char)ch);
		}
		if(str.length() != 0)
			return str.toString();
		return null;
	}
	
	public void myClose() throws IOException
	{
		fr.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}

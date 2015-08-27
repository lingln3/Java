package com.iostream.zifuliu;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		FileWriter fw = null;
//		FileReader fr = null;
		BufferedWriter buffer_w = null;
		//为了提高写入的效率，就使用了字符流的缓冲区
		try{
			fw = new FileWriter("demo2.txt",true);
			//创建一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
			buffer_w = new BufferedWriter(fw);
			//使用缓冲区的写入方法，将数据写入到缓冲去中
			buffer_w.write("abcdef"+LINE_SEPARATOR+"使用了BufferWriter缓冲区");
			buffer_w.newLine();
			buffer_w.write("使用了缓冲区的自定义换行方法newLine()");
			//使用缓冲区的刷新方法，将数据刷新到目的地中
			buffer_w.flush();
			for(int i=1; i<4; i++)
			{
				buffer_w.write("循环了"+i+"次"+LINE_SEPARATOR);
				buffer_w.flush();
			}
//			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Runtime.txt");
//			BufferedReader buffer_r = new BufferedReader(fr);
		}catch(IOException e)
		{
			
		}finally{
			if(buffer_w != null)
			{
				try{
					//关闭缓冲区，其实关闭的就是被缓冲的流对象
					buffer_w.close();//注意，关闭缓冲区的时候，也关闭了对应的流					
				}catch(IOException e)
				{
					throw new RuntimeException("找不到");
				}
			}
		}
	}

}

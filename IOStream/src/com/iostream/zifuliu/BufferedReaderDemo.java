package com.iostream.zifuliu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader buffer_r = null;
		try
		{
			fr = new FileReader("demo2.txt");
			buffer_r = new BufferedReader(fr);
			//int ch = buffer_r.read();
			String str = null;
			if(buffer_r.ready())
			{
				while((str = buffer_r.readLine())!=null)
				{
					System.out.println(str);
				}
			}
		}catch(IOException e)
		{
			
		}finally{
			if(buffer_r != null)
			{
				try{
					buffer_r.close();
			}catch(IOException e)
				{
				throw new RuntimeException("‘À–– ±¥ÌŒÛ");
				}
			}
		}
	}

}

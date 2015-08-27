package com.iostream.zijieliu;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		try
		{
			fr = new FileReader("demo.txt");
			int ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}finally{
			if(fr!=null)
			{
				try{
					fr.close();
				}catch(IOException e)
				{
					throw new RuntimeException("找不到指定文件");
				}
			}
		}
	}

}

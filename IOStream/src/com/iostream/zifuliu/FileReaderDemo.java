package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		int ch = 0;
		try
		{
			fr = new FileReader("demo.txt");
			while((ch = fr.read())!=-1)
				System.out.println(ch);
			/*int ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);
			ch = fr.read();
			System.out.println(ch);*/
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

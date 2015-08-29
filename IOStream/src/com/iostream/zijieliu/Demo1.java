package com.iostream.zijieliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException
	{
//		demo_write();
		demo_read();
	}
	public static void demo_write() throws FileNotFoundException
	{
		//�����ֽ�������������ڲ����ļ�
		FileOutputStream fos = new FileOutputStream("byte_demo.txt");
		//д����
		
		try {
			fos.write("abcd".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fos != null)
			{
				try{
					fos.close();
				}catch(IOException e)
				{
					
				}
			}
		}
	}
	public static void demo_read() throws IOException
	{
		FileInputStream fis = new FileInputStream("demo.txt");
		int ch = 0;
		while((ch = fis.read())!= -1)
		{
			System.out.println(fis.available());
			System.out.println(ch);
		}
		fis.close();
	}
		
	public static void demo_read2() throws IOException
	{
		FileInputStream fis = new FileInputStream("demo.txt");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf))!=-1)
			System.out.println(fis.available());
			System.out.println(new String(buf));
		fis.close();
	}	
	public static void demo_read3() throws IOException
	{
		FileInputStream fis = new FileInputStream("demo.txt");
		//�÷���Ҫ���ã���Ϊ�����ȡ���ļ����������׵����ڴ����������
		byte[] buf = new byte[fis.available()];
		fis.read(buf);
		System.out.println(new String(buf));
		fis.close();
	}	
}

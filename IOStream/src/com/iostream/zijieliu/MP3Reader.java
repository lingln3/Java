package com.iostream.zijieliu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MP3Reader {

	public static void main(String[] args) throws IOException {
		copy3();
	}
	
	
	public static void copy3() throws IOException
	{
		//使用自带的缓冲区BufferedInputStream,BufferedOutputStream
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Music\\画心.MP3");
		FileOutputStream fos = new FileOutputStream("E:\\画心3.MP3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = 0;
//		byte[] buf = new byte[1024];
		while((len = bis.read())!=-1)
		{
			bos.write(len);
//			bos.flush();
		}
		bis.close();
		bos.close();
			
	}
	
	public static void copy2() throws IOException
	{
		//使用自带的缓冲区BufferedInputStream,BufferedOutputStream
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Music\\画心.MP3");
		FileOutputStream fos = new FileOutputStream("E:\\画心2.MP3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = bis.read(buf))!=-1)
		{
			bos.write(buf);
			bos.flush();
		}
		bis.close();
		bos.close();
			
	}
	public static void copy() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Music\\画心.MP3");
		FileOutputStream fos = new FileOutputStream("E:\\画心.MP3");
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = fis.read(buf))!=-1)
		{
			fos.write(buf,0,len);
			
		}
		fis.close();
		fos.close();
	}
	
}

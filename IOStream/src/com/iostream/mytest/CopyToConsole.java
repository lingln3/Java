package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 讲一个文本文件数据显示在控制台上
 */
public class CopyToConsole {

	public static void main(String[] args) throws IOException{
		/* 1. 源：InputStream Reader
		 *    目的地：OutputStream Writer
		 *  2.是否纯文本？
		 *  	是，源：Reader
		 *  	   目的地：Writer
		 *  3.明确具体的设备
		 *  	源：硬盘——File
		 *  	目的地：控制台——System.out
		 *  4. 是否需要额外功能
		 *  	需要，高效——Buffere
		 *  		转换——字节流转为字符流 
		 */
		BufferedReader br = new BufferedReader(new FileReader("demo2.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//按行读写
		String len = null;
		while((len = br.readLine()) != null)
		{
			bw.write(len);
			bw.newLine();
			bw.flush();
		}
		br.close();		
	}

}

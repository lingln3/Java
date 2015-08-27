package com.iostream.keyin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 需求：将文本文件内容显示在控制台上
 */
public class TransStreamDemo3 {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		//字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("demo2.txt")));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line = br.readLine())!=null)
		{
//			if(line.equals("over"))
//				break;
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
	}

}

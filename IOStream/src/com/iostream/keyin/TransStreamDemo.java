package com.iostream.keyin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
		//字节流
		InputStream in = System.in;//源，都是字节数据
		//将字节流转成字符流的桥梁：InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);//字节流变字符流
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//字符流
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osw);
		String line = null;
		while((line = br.readLine())!=null)
		{
			if(line.equals("over"))
				break;
//			System.out.println(line.toUpperCase());
//			bw.write(line+LINE_SEPARATOR);
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
	}

}

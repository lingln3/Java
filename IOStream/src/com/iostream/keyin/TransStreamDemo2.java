package com.iostream.keyin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 需求：将键盘录入的数据写入到一个文件中
 */
public class TransStreamDemo2 {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("demo2.txt",true);
		//字符流
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demo2.txt",true)));
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
//			fw.write(line+LINE_SEPARATOR);
			
		}
//		fw.close();
	}

}

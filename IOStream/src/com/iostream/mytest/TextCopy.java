package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺸���һ���ı��ļ�
 */
public class TextCopy {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
//		demo1();
		demo2();
	}

	private static void demo2() throws IOException{
		FileReader fr  = new FileReader("demo2.txt");
		FileWriter fw = new FileWriter("demo3.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		int ch = 0;
		while((ch = br.read())!=-1)
		{
			if(ch == '\r')
				continue;
			if(ch == '\n')
			{
				bw.write(LINE_SEPARATOR);
				continue;
			}
			bw.write(ch);						
		}
		bw.close();
		br.close();
		
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("demo2.txt");
		FileWriter fw = new FileWriter("demo4.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String len = null;
		while((len = br.readLine())!=null)
		{
			bw.write(len);//��Ϊread��ȡ��һ�е��ַ���Ϣ�����ǲ����������з�������Ҫ��ӻ�����Ϣ
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}

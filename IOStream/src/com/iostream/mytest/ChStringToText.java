package com.iostream.mytest;
/*
 * 需求：讲一个中文字符串按照指定的编码表写入到一个文本文件中
 * 
 * 因为已经明确了指定的编码表的动作，那就不可以使用FileWriter，因为FileWriter使用的是
 * 默认的本地编码表，只能使用其父类，OutputStreamWriter
 * OutputStreamWriter接收一个字节输出流对象，既然是操作稳健，那么对象应该是FileOutputStream
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ChStringToText {

	public static void main(String[] args) throws IOException {
//		demo3();
//		demo4();
		demo5();
		}

	private static void demo5() throws IOException {
		FileInputStream is = new FileInputStream("text.txt");
		BufferedInputStream bis = new BufferedInputStream(is);
		OutputStream out = System.out;
		int ch = 0;
		while((ch = bis.read()) != -1)
		{
//			out.write(ch);
//			out.flush();
			System.out.println(ch);
		}
		is.close();
	}

	private static void demo4() throws IOException {
		InputStreamReader in = new InputStreamReader(new FileInputStream("text.txt"),"UTF-8");
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		int ch = 0;
		while((ch = in.read()) != -1)
		{
			osw.write(ch);
			osw.flush();
		}
		in.close();
	}

	private static void demo3() throws IOException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text.txt"),"UTF-8");
		osw.write("你好");
		osw.flush();
	}

	private static void demo2() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text.txt"),"GBK");
		osw.write("你好");
		osw.close();
	}

	public static void demo1() throws IOException {
		FileWriter fw = new FileWriter("text.txt");
		String s = "你好，我是谁aaaa？？？";//一个中文2个字节，所以text文本是18字节大小
		fw.write(s);
		fw.close();
	}

}

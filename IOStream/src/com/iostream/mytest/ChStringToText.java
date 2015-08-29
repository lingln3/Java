package com.iostream.mytest;
/*
 * ���󣺽�һ�������ַ�������ָ���ı����д�뵽һ���ı��ļ���
 * 
 * ��Ϊ�Ѿ���ȷ��ָ���ı����Ķ������ǾͲ�����ʹ��FileWriter����ΪFileWriterʹ�õ���
 * Ĭ�ϵı��ر����ֻ��ʹ���丸�࣬OutputStreamWriter
 * OutputStreamWriter����һ���ֽ���������󣬼�Ȼ�ǲ����Ƚ�����ô����Ӧ����FileOutputStream
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
		osw.write("���");
		osw.flush();
	}

	private static void demo2() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("text.txt"),"GBK");
		osw.write("���");
		osw.close();
	}

	public static void demo1() throws IOException {
		FileWriter fw = new FileWriter("text.txt");
		String s = "��ã�����˭aaaa������";//һ������2���ֽڣ�����text�ı���18�ֽڴ�С
		fw.write(s);
		fw.close();
	}

}

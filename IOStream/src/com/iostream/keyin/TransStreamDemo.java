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
		//�ֽ���
		InputStream in = System.in;//Դ�������ֽ�����
		//���ֽ���ת���ַ�����������InputStreamReader
		InputStreamReader isr = new InputStreamReader(in);//�ֽ������ַ���
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//�ַ���
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

package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * �Ӽ����н���Ϣ�����ı�
 * �ԡ�over����ʾ����
 */
public class CopyFromKey {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		InputStream in = System.in;
		FileWriter fw = new FileWriter("demo2.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String s = null;
		while((s = br.readLine()) != null)
		{
			if( s.equalsIgnoreCase("over"))
			{
				break;
			}
			fw.write(s+LINE_SEPARATOR);
			
		}
		fw.close();
		br.close();
	}

}

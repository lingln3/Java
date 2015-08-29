package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * ��һ���ı��ļ�������ʾ�ڿ���̨��
 */
public class CopyToConsole {

	public static void main(String[] args) throws IOException{
		/* 1. Դ��InputStream Reader
		 *    Ŀ�ĵأ�OutputStream Writer
		 *  2.�Ƿ��ı���
		 *  	�ǣ�Դ��Reader
		 *  	   Ŀ�ĵأ�Writer
		 *  3.��ȷ������豸
		 *  	Դ��Ӳ�̡���File
		 *  	Ŀ�ĵأ�����̨����System.out
		 *  4. �Ƿ���Ҫ���⹦��
		 *  	��Ҫ����Ч����Buffere
		 *  		ת�������ֽ���תΪ�ַ��� 
		 */
		BufferedReader br = new BufferedReader(new FileReader("demo2.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//���ж�д
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

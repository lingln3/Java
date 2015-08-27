package com.iostream.keyin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

public class KeyRead {

	public static void main(String[] args) throws IOException {
		readKey2();
	}
	
	public static void readKey() throws IOException
	{
		InputStream in = System.in;
		//������		
//		int ch = in.read();//����ʽ������û���ݾͻ�ȴ�
		int ch = 0;
		while((ch = in.read())!= (int)'\r')
			System.out.println(ch);
//		in.close();
//		System.out.println(ch);
	}
	
	public static void readKey2() throws IOException
	{   
		/*
		 * ��ȡ�û�����¼������ݣ�
		 * �������ݱ�ɴ�д����ʾ�ڿ���̨��
		 * ����û��������over����������¼��
		 * 
		 * ˼·��
		 * 1�� ��Ϊ����¼��ֻ��ȡһ���ֽڣ�Ҫ�ж��Ƿ���over��
		 * ��Ҫ�Ƚ��������ֽ�ƴ���ַ�����
		 * 2�� �Ǿ���Ҫһ��������StringBuilder
		 * 3�� ���û��س�֮ǰ����������ݱ���ַ����жϼ��ɡ�
		 */
		//��������
		StringBuilder sb = new StringBuilder();
		//��ȡ���̶�ȡ��
		InputStream in = System.in;
		//���������¼���ݶ������ֽڣ���ѭ����ȡ
		int ch = 0;
		while((ch = in.read())!= -1)
		{
			if(ch == '\r')
				continue;
			if(ch == '\n')
			{
				String temp = sb.toString();
				if("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0,sb.length());
			}
			else{
				//	����ȡ�����ֽڴ洢��StringBuilder��
				sb.append((char)ch);
//				System.out.println(ch);
			}
		}
		
	}

}

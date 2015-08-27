package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * exercise
 * ��c�̵�һ���ı��ļ����Ƶ�d��
 * 
 * ����ԭ��������д
 * ��ȡc���ļ��е����ݣ�����Щ����д�뵽d�̵��С�
 */
public class IOTest {
	private static final int BUFFER_SIZE = 1024;
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] read = new char[BUFFER_SIZE];//������
		int len_r = 0;
		try{
			//��ȡһ�����е��ı��ļ���ʹ���ַ���ȡ�����ļ������
			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Runtime.txt");
			//����һ��Ŀ�꣬���ڴ洢����
			fw = new FileWriter("E:\\Copy.txt");
		/*	while((len_r = fr.read(read))!=-1);
			fw.write(read,0,len_r);*/
			//��һ��дһ��
			int ch = 0;
			while((ch = fr.read())!=-1)
				fw.write(ch);
			fw.flush();
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}finally
		{
			if(fr!=null)
			{
				try{
					fr.close();
					}catch(IOException e)
					{
						throw new RuntimeException("ĳ���ļ�������");
					}
			}
			if(fw!=null)
			{
			try{
					fw.close();
				}catch(IOException e)
				{
					throw new RuntimeException("ĳ���ļ�������");
				}
			}
			
		}
	}

}

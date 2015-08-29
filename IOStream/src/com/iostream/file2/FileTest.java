package com.iostream.file2;

import java.io.File;

/*
 * ���󣺶�ָ��Ŀ¼�����������ݵ��г���������Ŀ¼�е����ݣ�
 * Ҳ�����Ϊ��ȱ���
 */
public class FileTest {

	public static void main(String[] args) {
		File dir = new File("E:\\postgraduate\\bishe\\Java\\IOStream");
		
		listAll(dir,0);
	}

	private static void listAll(File dir,int count) {
		System.out.println(getSpace(count)+"�ļ�"+dir.getName());
		//��ȡָ��Ŀ¼�µ�ǰ�������ļ��м��ļ�����
		File[] files = dir.listFiles();
		count++;
		for(int i=0; i<files.length; i++)
		{	
			
			if(files[i].isDirectory())//�ݹ�
			{
				listAll(files[i],count);
			}
			else
				System.out.println(files[i].getName());
		}
	}
	//�ո�
	private static String getSpace(int count) {
		StringBuilder str = new StringBuilder();
		str.append("|--");
		for(int i = 0;i<count;i++)
			str.insert(0, "|  ");
//			str.append("--");
		
		return str.toString();
	}

}

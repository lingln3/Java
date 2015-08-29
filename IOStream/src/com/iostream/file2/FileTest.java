package com.iostream.file2;

import java.io.File;

/*
 * 需求：对指定目录进行所有内容的列出（包括子目录中的内容）
 * 也可理解为深度遍历
 */
public class FileTest {

	public static void main(String[] args) {
		File dir = new File("E:\\postgraduate\\bishe\\Java\\IOStream");
		
		listAll(dir,0);
	}

	private static void listAll(File dir,int count) {
		System.out.println(getSpace(count)+"文件"+dir.getName());
		//获取指定目录下当前的所有文件夹及文件对象
		File[] files = dir.listFiles();
		count++;
		for(int i=0; i<files.length; i++)
		{	
			
			if(files[i].isDirectory())//递归
			{
				listAll(files[i],count);
			}
			else
				System.out.println(files[i].getName());
		}
	}
	//空格
	private static String getSpace(int count) {
		StringBuilder str = new StringBuilder();
		str.append("|--");
		for(int i = 0;i<count;i++)
			str.insert(0, "|  ");
//			str.append("--");
		
		return str.toString();
	}

}

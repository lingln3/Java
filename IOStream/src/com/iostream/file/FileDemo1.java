package com.iostream.file;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		constructorDemo();
	}

	public static void constructorDemo() {
		//���Խ�һ���Ѵ��ڵģ��򲻴��ڵ��ļ���Ŀ¼��װ��file����
		File file = new File("text.txt");
		
		File file2 = new File("E:\\","text.txt");
		File f = new File("E:\\");
		File f3 = new File(f,"text2.txt");
		
		File f4 = new File("E:"+File.separator+"text3.txt");
		System.out.println(f4);
	}
	
}

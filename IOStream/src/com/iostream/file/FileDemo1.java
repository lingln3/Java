package com.iostream.file;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		
		constructorDemo();
	}

	public static void constructorDemo() {
		//可以将一个已存在的，或不存在的文件或目录封装成file对象
		File file = new File("text.txt");
		
		File file2 = new File("E:\\","text.txt");
		File f = new File("E:\\");
		File f3 = new File(f,"text2.txt");
		
		File f4 = new File("E:"+File.separator+"text3.txt");
		System.out.println(f4);
	}
	
}

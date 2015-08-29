package com.iostream.file;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
//		listDemo();
		listDemo2();
	}

	private static void listDemo2() {
		File file = new File("E:\\");
		
		File[] files = file.listFiles(new FilterByHidden());
		for(File f:files)
			System.out.println(f);
		
	}

	private static void listDemo() {
		File file = new File("D:\\hehe");
		String[] name = file.list();
		System.out.println(name.length);
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}

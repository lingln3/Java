package com.iostream.file;

import java.io.File;

public class FileFilterDemo {
/*
 * 找出E文件目录下的mp3文件
 */
	public static void main(String[] args) {
		mp3_demo1();
//		
	}

	public static void mp3_demo1() {
		File dir = new File("E:\\");
//		String[] names = dir.list(new FilterByName());
		String[] names = dir.list(new SuffixFilter(".MP3"));
		for(String s:names)
			System.out.println(s);
	}

}

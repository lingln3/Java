package com.iostream.file2;

import java.io.File;
import java.io.IOException;

public class DeleteDirs {
/*
 * 删除某一个文件目录下所有的内容
 */
	public static void main(String[] args) throws IOException {
		File dir = new File("abc");
//		dir.mkdirs();
		deleteAll(dir);
			
	}
	public static void deleteAll(File dir)
	{
		File[] files = dir.listFiles();
		for( int i=0; i<files.length; i++)
		{
			if(files[i].isDirectory())
			{
				deleteAll(files[i]);
			}
			files[i].delete();
		}
		dir.delete();
	}
}

package com.iostream.file2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * 获取指定目录下，指定扩展名的文件（包含子目录中的）
 * 这些文件的绝对路径写入到一个文本文件中
 * 
 * 简单说，就是建立一个指定扩展名的文件的列表。
 * 
 * 思路：
 * 1. 必须进行深度遍历
 * 2. 要在遍历的过程中进行过滤，将负荷条件的内容都存储到容器中
 * 3. 对容器中的内容进行遍历，并将绝对路径写入到文件中。
 */
public class FileListAll {
	private static int num = 0;
	public static void main(String[] args) throws IOException {
		File dir = new File("E:\\postgraduate\\bishe\\Java\\CollectionLearning");
	/*	FilterJava filter = new FilterJava(".java");
		listAll(dir,filter);
		System.out.println(num);*/
		List<File> list = new ArrayList<File>();
		FilterJava filter = new FilterJava(".java");
		File destFile = new File("list.txt");
		getFiles(dir,filter,list);
		writeFile(list,destFile);
		System.out.println(num);
	}
	//往目标路径中写入文件信息
	//该方法比较好
	public static void writeFile(List<File> list,File destFile)
	{
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter(destFile,true));
			for(File f:list)
			{
				bw.write(f.getAbsolutePath());
				bw.newLine();
				bw.flush();
			}
		}catch(IOException e)
		{
			throw new RuntimeException("写入失败");
		}finally
		{
			if(bw != null)
				try{
					bw.close();
				}catch(IOException e){
					throw new RuntimeException("关闭失败");
			}
		}
	}
	/*
	 * 对指定目录中 的内容进行深度遍历，并按照指定过滤器，进行过滤
	 * 将过滤后的内容存储到指定容器中
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list)
	{
		File[] files = dir.listFiles();
		for(File f:files)
		{
			if(f.isDirectory())
			{
				//递归
				getFiles(f,filter,list);
			}
			else{
				//对遍历到的文件进行过滤器的过滤
				if(filter.accept(dir, f.getName()))
				{
					list.add(f);
					num++;
				}
			}
		}
	}
	/*
	 * 该方法是找到一个写入一个，这样效率比较低。
	 * 所以上面的方法进行了改进：将所有符合条件的文件都写入了list容器中，最终将list中的信息全部写入。
	 */
	public static void listAll(File dir,FilterJava filter) throws IOException
	{
		File[] files = dir.listFiles();
//		System.out.println(files.length);
		for(File f:files)
		{
			if(f.isDirectory())
			{
				listAll(f,filter);
			}
			else{
				//注意，使用过滤器是对某一个指定文件进行过滤
				if(filter.accept(dir, f.getName()))
				{
					writeList(f);
					num++;
				}
			}
		}
	}
	
	public static void writeList(File f) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\list.txt",true)));
		bw.write(f.getName());
		bw.newLine();
		System.out.println(f.getName());
		bw.close();
	}
}

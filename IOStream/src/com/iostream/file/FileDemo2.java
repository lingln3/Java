package com.iostream.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		/*
		 * File����ĳ���������
		 * 1. ��ȡ
		 * 		1.1 ��ȡ�ļ�����
		 * 		1.2 ��ȡ�ļ�·��
		 * 		1.3 ��ȡ�ļ���С
		 * 		1.4 ��ȡ�ļ��޸�ʱ��
		 * 2. ������ɾ��
		 * 		boolean 
		 * 3. �ж�
		 * 4. ������
		 */
//		getDemo();
//		createAndDelete();
//		createAndDeleteDemo();
//		isDemo();
//		renameToDemo();
//		listRootDemo();
		spaceDemo();
	}
	
	private static void spaceDemo() {
		//�ҵ�ʣ��ռ������ļ�
		File[] files = File.listRoots();
		Map<File,Long> map = new HashMap<File,Long>();
		long max = 0;
		File max_f = null;
		for(File f:files)
		{
			long free_space = f.getFreeSpace();
			map.put(f, free_space);
			if(free_space > max)
			{
				max = free_space;
				max_f = f;
			}
			System.out.println(f+":"+free_space);
		}
		System.out.println("����"+max_f+":"+max);
	}

	private static void listRootDemo() {
	/*	File[] files = File.listRoots();
		for(File f:files)
			System.out.println(f);*/
		File file = new File("d:\\");
		System.out.println("getFreeSpace:"+file.getFreeSpace());
		System.out.println("getTotalSpace:"+file.getTotalSpace());
		System.out.println("getUsableSpace:"+file.getUsableSpace());
	}

	private static void renameToDemo() {
		File f1 = new File("C:\\Users\\Administrator\\Music\\Զ��.MP3");
		File f2 = new File("Զ��2.MP3");
		System.out.println(f2.renameTo(f1));
	}

	private static void isDemo() throws IOException {
		File f = new File("aa.txt");
		/*boolean b = f.exists();
		System.out.println(b);
		if(!b)
			f.createNewFile();*/
		f.mkdir();	
		//������ж��Ƿ����
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
			
	}

	private static void createAndDeleteDemo() throws IOException {
		File dir = new File("he\\xixi\\ha\\ho\\ni");
//		dir.createNewFile();
		dir.mkdirs();
		System.out.println(dir.delete());
//		boolean b = dir.mkdir();//��������Ŀ¼
//		System.out.println(b);
//		File dir_parent = dir.getParentFile();
//		File file = new File(dir,"abc.txt");
//		file.createNewFile();
//		File[] files = dir_parent.listFiles();
//		file.delete();
//		boolean b2 = dir.delete();
//		System.out.println(b2);
//		for(File f:files)
//			System.out.println(f.getName());
	}

	private static void createAndDelete() throws IOException {
		
		File file = new File("file.txt");
		boolean b = file.createNewFile();
		boolean b2 = file.delete();
		System.out.println("b2 = "+b2);
	}

	public static void getDemo()
	{
		File file = new File("demo.txt");
		String name = file.getName();
		String path = file.getPath();
		String abs_path = file.getAbsolutePath();
		long len = file.length();
		long time = file.lastModified();
		Date date = new Date(time);
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		String str_time = dateFormat.format(date);
		System.out.println(name);
		System.out.println(path);
		System.out.println(abs_path);
		System.out.println(time);
		System.out.println(str_time);
		System.out.println("parent:"+file.getParent());
	}
}

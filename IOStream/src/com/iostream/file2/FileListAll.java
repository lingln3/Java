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
 * ��ȡָ��Ŀ¼�£�ָ����չ�����ļ���������Ŀ¼�еģ�
 * ��Щ�ļ��ľ���·��д�뵽һ���ı��ļ���
 * 
 * ��˵�����ǽ���һ��ָ����չ�����ļ����б�
 * 
 * ˼·��
 * 1. ���������ȱ���
 * 2. Ҫ�ڱ����Ĺ����н��й��ˣ����������������ݶ��洢��������
 * 3. �������е����ݽ��б�������������·��д�뵽�ļ��С�
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
	//��Ŀ��·����д���ļ���Ϣ
	//�÷����ȽϺ�
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
			throw new RuntimeException("д��ʧ��");
		}finally
		{
			if(bw != null)
				try{
					bw.close();
				}catch(IOException e){
					throw new RuntimeException("�ر�ʧ��");
			}
		}
	}
	/*
	 * ��ָ��Ŀ¼�� �����ݽ�����ȱ�����������ָ�������������й���
	 * �����˺�����ݴ洢��ָ��������
	 */
	public static void getFiles(File dir,FilenameFilter filter,List<File> list)
	{
		File[] files = dir.listFiles();
		for(File f:files)
		{
			if(f.isDirectory())
			{
				//�ݹ�
				getFiles(f,filter,list);
			}
			else{
				//�Ա��������ļ����й������Ĺ���
				if(filter.accept(dir, f.getName()))
				{
					list.add(f);
					num++;
				}
			}
		}
	}
	/*
	 * �÷������ҵ�һ��д��һ��������Ч�ʱȽϵ͡�
	 * ��������ķ��������˸Ľ��������з����������ļ���д����list�����У����ս�list�е���Ϣȫ��д�롣
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
				//ע�⣬ʹ�ù������Ƕ�ĳһ��ָ���ļ����й���
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

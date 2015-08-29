package com.iostream.properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		myLoad();
		/*
		 * Map
		 * 	|--HashTable
		 * 		|--Properties
		 */
//		propertyDemo();
//		propAndStream();
		/*prop = System.getProperties();
		prop.list(System.out);*/
//		propStore();
//		propRead();
	}
	/*
	 * ʵ��Properties��load����
	 */
	public static void myLoad() throws IOException
	{
		Properties prop = new Properties();
		BufferedReader br = new BufferedReader(new FileReader("info.txt"));
		String len = null;
		while((len = br.readLine())!=null)
		{
			if(!len.startsWith("#"))
			{
				String[] str = len.split("=");
				prop.setProperty(str[0], str[1]);
			}
		}
		prop.list(System.out);
		br.close();
	}
	public static void propRead() throws IOException
	{
		Properties prop = new Properties();
		/*
		 * �����е�����������һ���ļ�
		 * ע�⣺����Ҫ��֤���ļ��е������Ǽ�ֵ�ԡ�
		 * ��Ҫʹ�õ���ȡ��
		 */
		FileInputStream fis = new FileInputStream("info.txt");
		//ʹ��load����
		prop.load(fis);
		prop.list(System.out);
	}
	/*
	 * �־û��洢store
	 */
	public static void propStore() throws IOException
	{
		//����һ��Properties����
		Properties prop = new Properties();
		//�洢Ԫ��
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		//��Ҫ����Щ�����е����ַ�����ֵ��Ϣ�־û��洢���ļ���
		//��Ҫ���������
		FileOutputStream fos = new FileOutputStream("info.txt");
		//���������ݴ洢���ļ��У�ʹ��store����
		prop.store(fos,"number+name");//ע�⣬ע����ò�Ҫʹ������
		fos.close();
	}
	/*
	 * ��ʾProperties���Ϻ����������ϵĹ���
	 */
	public static void propAndStream()
	{
		//����һ��Properties����
		Properties prop = new Properties();
		//�洢Ԫ��
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		
		prop.list(System.out);
	}

	/*
	 * Properties���ϵĴ��ȡ
	 */
	public static void propertyDemo()
	{
		//����һ��Properties����
		Properties prop = new Properties();
		//�洢Ԫ��
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		
		//�޸�Ԫ��
		prop.setProperty("02", "hehe2");
	
		//ȡ��Ԫ��
		Set<String> keys = prop.stringPropertyNames();
		for(String s:keys)
		{
			String value = prop.getProperty(s);
			System.out.println("key:"+s+"����"+"value:"+value);
		}
		
		
	}
}

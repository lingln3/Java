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
	 * 实现Properties的load方法
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
		 * 集合中的数据来自于一个文件
		 * 注意：必须要保证该文件中的数据是键值对。
		 * 需要使用到读取流
		 */
		FileInputStream fis = new FileInputStream("info.txt");
		//使用load方法
		prop.load(fis);
		prop.list(System.out);
	}
	/*
	 * 持久化存储store
	 */
	public static void propStore() throws IOException
	{
		//创建一个Properties集合
		Properties prop = new Properties();
		//存储元素
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		//需要将这些集合中的行字符串键值信息持久化存储到文件中
		//需要关联输出流
		FileOutputStream fos = new FileOutputStream("info.txt");
		//将集合数据存储到文件中，使用store方法
		prop.store(fos,"number+name");//注意，注释最好不要使用中文
		fos.close();
	}
	/*
	 * 演示Properties集合和流对象相结合的功能
	 */
	public static void propAndStream()
	{
		//创建一个Properties集合
		Properties prop = new Properties();
		//存储元素
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		
		prop.list(System.out);
	}

	/*
	 * Properties集合的存和取
	 */
	public static void propertyDemo()
	{
		//创建一个Properties集合
		Properties prop = new Properties();
		//存储元素
		prop.setProperty("01", "haha");
		prop.setProperty("02", "hehe");
		prop.setProperty("03", "xixi");
		prop.setProperty("04", "heihei");
		
		//修改元素
		prop.setProperty("02", "hehe2");
	
		//取出元素
		Set<String> keys = prop.stringPropertyNames();
		for(String s:keys)
		{
			String value = prop.getProperty(s);
			System.out.println("key:"+s+"……"+"value:"+value);
		}
		
		
	}
}

package com.otherclass.runtime;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws InterruptedException{
		/*
		 * Runtime类没有构造方法摘要，说明了该类不可以创建对象。
		 * 同时，该类中存在部分非静态方法，说明，该类肯定提供了一个static方法返回该类的对象。
		 * 发现，该类中有且只有一个static方法static Runtime getRuntime()提供了一个
		 * 返回该类对象的方法，说明Runtime类使用了单例设计模式。
		 */
		Runtime rt = Runtime.getRuntime();
		try{
//			rt.exec("D:\\soft-download\\ChromeGAE\\ChromeGAE.exe");
//			rt.exec("notePad.exe C:\\Users\\Administrator\\Desktop\\Runtime.txt");
			Process p = rt.exec("notePad.exe C:\\Users\\Administrator\\Desktop\\Runtime.txt");
			Thread.sleep(5000);
			p.destroy();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}

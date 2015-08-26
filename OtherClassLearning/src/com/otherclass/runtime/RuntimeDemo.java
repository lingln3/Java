package com.otherclass.runtime;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws InterruptedException{
		/*
		 * Runtime��û�й��췽��ժҪ��˵���˸��಻���Դ�������
		 * ͬʱ�������д��ڲ��ַǾ�̬������˵��������϶��ṩ��һ��static�������ظ���Ķ���
		 * ���֣�����������ֻ��һ��static����static Runtime getRuntime()�ṩ��һ��
		 * ���ظ������ķ�����˵��Runtime��ʹ���˵������ģʽ��
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
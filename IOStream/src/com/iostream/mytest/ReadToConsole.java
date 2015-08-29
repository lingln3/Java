package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 读取键盘录入数据，显示在控制台上
 */
public class ReadToConsole {
	private static final String LINE_SEPARTAOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		/*
		 * 1. 明确源和目的
		 * 		源：InputStream Reader
		 * 		目的：OutputStream Writer
		 * 2. 是否纯文本？
		 * 		是：
		 * 			源：Reader
		 * 			目的：Writer
		 * 3. 明确设备
		 * 		源：键盘——System.in
		 * 		目的：控制台——System.out
		 * 4. 是否需要额外功能
		 *  	是：
		 *  	高效——Buffere
		 *  	转换
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String len = null;
		while((len = br.readLine()) != null)
		{
			if( len.equalsIgnoreCase("over"))
			{
				break;
			}
			bw.write(len+LINE_SEPARTAOR);
//			bw.newLine();
			bw.flush();
		}
		
	}

}

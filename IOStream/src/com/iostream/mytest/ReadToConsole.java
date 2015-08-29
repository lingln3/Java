package com.iostream.mytest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * ��ȡ����¼�����ݣ���ʾ�ڿ���̨��
 */
public class ReadToConsole {
	private static final String LINE_SEPARTAOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		/*
		 * 1. ��ȷԴ��Ŀ��
		 * 		Դ��InputStream Reader
		 * 		Ŀ�ģ�OutputStream Writer
		 * 2. �Ƿ��ı���
		 * 		�ǣ�
		 * 			Դ��Reader
		 * 			Ŀ�ģ�Writer
		 * 3. ��ȷ�豸
		 * 		Դ�����̡���System.in
		 * 		Ŀ�ģ�����̨����System.out
		 * 4. �Ƿ���Ҫ���⹦��
		 *  	�ǣ�
		 *  	��Ч����Buffere
		 *  	ת��
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

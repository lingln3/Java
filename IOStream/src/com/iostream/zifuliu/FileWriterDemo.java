package com.iostream.zifuliu;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���󣺽�һЩ���ִ洢��Ӳ�̵�һ���ļ���
 * Ӳ�̵����ݵĻ����������ļ���
 */
public class FileWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) throws IOException{
		//����һ���������ļ���д���ַ����ݵ��ַ����������
		/*
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ���
		 * ��ȷ���ļ������ڴ洢���ݶ�Ŀ�ĵأ�
		 * 
		 * ����ļ������ڣ�����Զ�������
		 * ����ļ����ڣ���ᱻ���ǡ�
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		/*
		 * ����Writer�����е�write(String)������д�����ݡ�
		 * �������д�뵽����ʱ�������У���д�뵽���У�
		 */
		
		fw.write("��ã��һ����ˣ�");
		fw.write("hihi~~"+LINE_SEPARATOR);
		/*
		 * ����ˢ�£�������ֱ��д��Ŀ�ĵ���
		 */
		fw.flush();
		/*
		 * �ر������ر���Դ
		 * ע�⣬����closeʱ�����ڲ�Ҳ���Զ�����flush()����
		 */
		fw.close();
	}

}

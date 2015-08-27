package com.iostream.zifuliu;


import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		FileWriter fw = null;
//		FileReader fr = null;
		BufferedWriter buffer_w = null;
		//Ϊ�����д���Ч�ʣ���ʹ�����ַ����Ļ�����
		try{
			fw = new FileWriter("demo2.txt",true);
			//����һ���ַ�д�����Ļ��������󣬲���ָ��Ҫ������������������
			buffer_w = new BufferedWriter(fw);
			//ʹ�û�������д�뷽����������д�뵽����ȥ��
			buffer_w.write("abcdef"+LINE_SEPARATOR+"ʹ����BufferWriter������");
			buffer_w.newLine();
			buffer_w.write("ʹ���˻��������Զ��廻�з���newLine()");
			//ʹ�û�������ˢ�·�����������ˢ�µ�Ŀ�ĵ���
			buffer_w.flush();
			for(int i=1; i<4; i++)
			{
				buffer_w.write("ѭ����"+i+"��"+LINE_SEPARATOR);
				buffer_w.flush();
			}
//			fr = new FileReader("C:\\Users\\Administrator\\Desktop\\Runtime.txt");
//			BufferedReader buffer_r = new BufferedReader(fr);
		}catch(IOException e)
		{
			
		}finally{
			if(buffer_w != null)
			{
				try{
					//�رջ���������ʵ�رյľ��Ǳ������������
					buffer_w.close();//ע�⣬�رջ�������ʱ��Ҳ�ر��˶�Ӧ����					
				}catch(IOException e)
				{
					throw new RuntimeException("�Ҳ���");
				}
			}
		}
	}

}

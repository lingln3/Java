package com.iostream.zifuliu;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * �Զ���Ķ�ȡ����������ʵ����ģ��һ��BufferedReader
 * 
 * ���������޷Ǿ��Ƿ�װ��һ������
 * ���ṩ�˸���ķ�����������з���
 * ��ʵ��Щ�������ղ����Ķ�������ĽǱָ꣨�룩��
 * 
 * �����ԭ��
 * ��ʵ���Ǵ�Դ��ȡ��һ������װ���������С�
 * �ٴӻ������в��ϵ�ȡ��һ��һ�����ݡ�
 * 
 * �ڴ˴�ȡ����ٴ�Դ�м���ȡһ�����ݽ���������
 * ��Դ�е�����ȡ��ʱ����-1��Ϊ�������
 */
public class MyBufferedReader extends Reader{
	Reader fr = null;
	//����һ��������Ϊ������
	private char[] buf = new char[1024];
	//��һ��ָ�����ڲ�����������е�Ԫ�أ������������һ��Ԫ�غ�ָ��Ӧ�ù��㡣
	private int pos = 0;
	//��һ������������¼�������е����ݸ������������ݼ����㣬�ʹ�Դ�м�����ȡ���ݵ��������С�
	private int count = 0;
	
	public MyBufferedReader(Reader fr) {
		this.fr = fr;
	}
	
	public int myRead() throws IOException
	{
		//��Դ�л�ȡһ�����ݵ��������У���Ҫ�����жϣ�ֻ�м�����countΪ0ʱ������Ҫ��Դ�л�ȡ����
		if(count == 0)
		{
			count = fr.read(buf);
			pos = 0;
		}
		if(count < 0)
			return -1;
		 char  ch = buf[pos];
		 pos++;
		 count--;
		 return ch;
		/*if( count == 0)
		{
			count = fr.read(buf);
			
			if(count < 0)
				return -1;			
			pos = 0;
			int ch = buf[pos];
			pos++;
			count--;
			return ch;
		}else if(count >0)
		{
			int ch = buf[pos];
			pos++;
			count--;
			return ch;
		}*/
		
	}
	
	public String myReadLine() throws IOException
	{
		StringBuilder str = new StringBuilder();
		int ch = 0;
		while( (ch = myRead())!= -1)
		{
			if(ch == '\r')
				continue;
			if(ch == '\n')
				return str.toString();
			str.append((char)ch);
		}
		if(str.length() != 0)
			return str.toString();
		return null;
	}
	
	public void myClose() throws IOException
	{
		fr.close();
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		
	}

}

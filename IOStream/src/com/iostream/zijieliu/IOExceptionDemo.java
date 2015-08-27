package com.iostream.zijieliu;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	public static void main(String[] args) {
		FileWriter fw = null;
		try{
			fw = new FileWriter("k:\\demo.txt",true);
			fw.write("��ã��һ����ˣ�");
			fw.write("hihi~~"+LINE_SEPARATOR);			
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally{
			if(fw!=null)//ֻ����ָ��·���ļ����ڵ�����£����ܽ��йر��ļ�����
			{
				try{
					fw.close();		//close����ִ�У����Է���finally�������		
				}catch(IOException e)
				{
					throw new RuntimeException("�ر�ʧ�ܣ�");
				}
			}
		}
	}

}
